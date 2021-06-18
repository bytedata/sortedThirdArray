package com.bytedata;

public class SortedThirdArray {
	public static void main(String[] args) {
		//Array declaration
		int[] array1 = { 1, 3, 5, 7, 8 };
		int[] array2 = { 2, 4, 6, 9, 10 };
		merge(array1, array2);
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] array3 = new int[arr1.length + arr2.length];
		int m = 0;
		for (int i = 0; i < (array3.length); i++) {
			if (m == arr2.length) {
				array3[i] = arr1[i - m];
			} else if (((i - m) < (arr1.length)) && (arr1[i - m] < arr2[m])) {
				array3[i] = arr1[i - m];
			} else {
				array3[i] = arr2[m];
				m++;
			}
		}
		System.out.println("\nThird array in sorted order: \n");
		for (int i : array3) {
			System.out.print(i + ", ");
		}
		return array3;
	}
}