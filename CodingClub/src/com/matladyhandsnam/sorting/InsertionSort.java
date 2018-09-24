package com.matladyhandsnam.sorting;

public class InsertionSort {
	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
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
		insertionSort(i);
	}
}
