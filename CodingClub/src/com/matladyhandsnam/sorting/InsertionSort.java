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
		int[] i = { 1730, 415631, 226963, 154744, 530435, 847751, 542733, 124825, 37341, 566494, 848969, 827408, 820333,
				209613, 244663, 398403, 346068, 681509, 927532, 34513, 850950, 541700, 525560, 978668, 771145, 56708,
				959042, 813451, 50222, 443688, 358951, 544318, 579834, 932619, 856196, 78236, 466989, 768073, 857799,
				816010, 418173, 152661, 19885, 12696, 217760, 442969, 262584, 483229, 206380, 613140, };
		insertionSort(i);
	}
}
