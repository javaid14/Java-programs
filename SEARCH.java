// Java program to check whether
// an element is present in array or not

import java.util.Arrays;
import java.util.stream.IntStream;

class SEARCH {

	private static void check(int[] arr, int toCheckValue)
	{
		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}

		System.out.println("Is " + toCheckValue
						+ " present in the array: " + test);
	}

	public static void main(String[] args)
	{

		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

		int toCheckValue = 7;

		System.out.println("Array: "
						+ Arrays.toString(arr));

		check(arr, toCheckValue);
	}
}
