package com.matladyhandsnam.sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}

			}
			int temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
		}
		print(arr);

	}
	
	

	private static void print(int[] i) {
		for (int x : i) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 3, 4, 3, 2, 66, 5 };
		selectionSort(i);
	}

}


