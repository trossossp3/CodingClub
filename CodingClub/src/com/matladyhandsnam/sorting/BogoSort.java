package com.matladyhandsnam.sorting;

import java.io.BufferedReader;
import java.io.FileReader;

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

		int[] i = { 639487, 512000, 218057, 116950, 782315, 771053, 179083, 795498, 19661, 299562, 553094, 587633,
				870289, 261188, 180634, 479877, 108239, 130908, 532483, 581712, 630693, 461909, 558739, 718527, 108596,
				738675, 640154, 844859, 262957, 222440, 439727, 526645, 757293, 897449, 230796, 97426, 277689, 357206,
				794155, 471048, 139876, 786471, 293862, 10031, 836389, 935239, 651642, 309826, 317445, 386494, };
		new BogoSort(i);
	}

}
