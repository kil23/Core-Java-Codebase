/*
FlatMaps:
- Useful when we have to work with List of lists.
- We can also flatten stream of Lists to stream of elements.
    e.g.   Stream(list1, list2).flatMap(List::stream)
- In above example we wanted to add two list and have a stream which can be done using FlatMaps easily.
*/

import java.util.*;
import java.util.stream.*;

public class FlatMaps{
	public static void main(String[] args) {
		State karnataka = new State();
		karnataka.addCity("Bangalore");
		karnataka.addCity("Mysore");

		State punjab = new State();
		punjab.addCity("Chandigarh");
		punjab.addCity("Ludhiana");

		List<State> allStates = Arrays.asList(karnataka, punjab);

		//Java Stream flatMap way
		List<String> allCities = allStates.stream()
                                      .flatMap(e -> e.getCities().stream())
                                      .collect(Collectors.toList());

		System.out.println(allCities);

		//legacy way
		allCities = new ArrayList<String>();
		for(State state : allStates) {
			for(String city : state.getCities())
				allCities.add(city);
		}
		System.out.println(allCities);
	}

}

class State {
	private List<String> cities = new ArrayList<>();

	public void addCity(String city) {
		cities.add(city);
	}

	public List<String> getCities() {
		return this.cities;
	}
}
