class Enum{
	//Enumeration serves the purpose of representing a group of named constants in a programming language.
	// Enums are used when we know all possible values at compile time, such as choices on a menu.
	enum String {
		abc, def
	}

	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	enum Color{
		Red(10), Green(20), Blue(30);

		private int val;

		public int getValue(){
			return this.val;
		}

		private Color(int a){
			this.val = a;
		}
	}

	/*enum ESport{
		Csgo{
			public int members(){
				return 5;
			}

		}, Dota{
			public int members(){
				return 5;
			}

		}, Pubg{
			public int members(){
				return 4;
			}

		}, Fortnite{
			public int members(){
				return 4;
			}

		};
		public abstract int members();
	}*/

	public static void main(java.lang.String args[]){
		Color []colors = Color.values();
		String [] str = String.values();
		for(Color color : colors){
			System.out.println("Color: "+ color.name()+ " & Value :"+color.getValue());
		}

			for(String s : str){
			System.out.println("String: "+ s.name());
		}

		/*ESport[] es = ESport.values();
		for(ESport ev : es){
			System.out.println(ev+ " "+ev.members());
		}
*/
		Day[] daysOfWeek = Day.values();
		for(Day today : daysOfWeek){
			switch(today){
				case SUNDAY:
					System.out.println("Today is Sunday");
					break;
				case MONDAY:
					System.out.println("Today is Monday");
					break;
				case TUESDAY:
					System.out.println("Today is Tuesday");
					break;
				case WEDNESDAY:
					System.out.println("Today is Wednesday");
					break;
				case THURSDAY:
					System.out.println("Today is Thursday");
					break;
				case FRIDAY:
					System.out.println("Today is Friday");
					break;
				case SATURDAY:
					System.out.println("Today is Saturday");
					break;
			}
		}
	}
}