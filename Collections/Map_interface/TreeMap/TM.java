class TM{

	static void printFreq(int arr[])
	{
		TreeMap<Integer, Integer> tp = new TreeMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++)
		{
			Integer c = tp.get(arr[i]);

			if (tp.get(arr[i]) == null)
				tp.put(arr[i], 1);
			else
				tp.put(arr[i], ++c);
		}

		for (Map.Entry m:tp.entrySet())
		System.out.println("Frequency of " + m.getKey() +
		" is " + m.getValue());
	}

	public static void main(String[] args){
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
		printFreq(arr);
	}
}
