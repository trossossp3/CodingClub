package com.matladyhandsnam.sorting;

public class BogoSort {

	public BogoSort(int[] i) {
		int counter = 0;
		System.out.println("I'll sort " + i.length + " elements...");
		while (!isSorted(i)) {
			shuffle(i);
			counter++;
			/*
			 * if(counter%1000000==0) { System.out.println(counter); }
			 */
		}
		System.out.println("Solution found! (shuffled " + counter + " times)");
		print(i);
	}

	private void print(int[] i) {
		for (int x : i) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}

	private void shuffle(int[] i) {
		for (int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length);
			int index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean isSorted(int[] i) {
		for (int x = 0; x < i.length - 1; ++x) {
			if (i[x] > i[x + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] i = { 237642, 962984, 510246, 327116, 233596, 69512, 696262, 698020, 334453, 283565, };
		new BogoSort(i);
	}

}
