public class Sorting
{
	//-----------------------------------------------------------------
	// Sorts the specified array of objects using the selection
	// sort algorithm.
	//-----------------------------------------------------------------
	public static <Integer extends Comparable<Integer>> void selectionSort (Integer[] list)
	{
		int min;
		Comparable temp;
		for (int index = 0; index < list.length-1; index++)
		{
			min = index;
			for (int scan = index+1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) < 0)
					min = scan;
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = (Integer) temp;
		}
	}
	//-----------------------------------------------------------------
	// Sorts the specified array of objects using the insertion
	// sort algorithm.
	//-----------------------------------------------------------------
	public static <Integer extends Comparable<Integer>> void insertionSort (Integer[] list)
	{
		for (int index = 1; index < list.length; index++)
		{
			Comparable key = list[index];
			int position = index;
			// Shift larger values to the right
			while (position > 0 && key.compareTo(list[position-1]) > 0)
			{
				list[position] = list[position-1];
				position--;
			}
				list[position] = (Integer) key;
		}
	}
	public static <Object extends Comparable<Object>> void insertionSortSale (SalePerson[] list)
	{
		namesort(list);
		for (int index = 1; index < list.length; index++)
		{
			SalePerson key = list[index];
			int position = index;
			// Shift larger values to the right
			while ((position > 0 && key.compareTo(list[position-1]) > 0 ))
			{
					list[position] = list[position-1];
					position--;
			}
			list[position] = key;
		}
	}
	public static <Object extends Comparable<Object>> void namesort (SalePerson[] list){
		for (int index = 1; index < list.length; index++)
		{
			SalePerson key = list[index];
			int position = index;
			// Shift larger values to the right
			while ((position > 0 && key.getlastname().compareTo(list[position-1].getlastname())< 0 ))
			{
				System.out.println(key.getlastname().compareTo(list[position-1].getlastname()));
				System.out.println(key.getlastname() + " | " + list[position-1].getlastname());
				list[position] = list[position-1];
				position--;
			}
			list[position] = key;
		}
	}
}
//