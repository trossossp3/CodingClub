package com.matladyhandsnam.sorting;
import processing.core.PApplet;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BogoSort {

	public BogoSort(int[] i) throws InterruptedException {
		int counter = 0;
		System.out.println("I'll sort " + i.length + " elements...");
		while (!isSorted(i)) {
			shuffle(i);
			print(i);
			//Thread.sleep(200);
			counter++;
			/*
			 * if(counter%1000000==0) { System.out.println(counter); }
			 */
		}
		System.out.println("\nSolution found! (shuffled " + counter + " times)");
		print(i);
	}

	private void print(int[] i) {
		/*for (int x : i) {
			System.out.print(x + ", ");
		}
		System.out.println();
	*/
	System.out.println(Arrays.toString(i));	
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

	public static void main(String[] args) throws IOException, InterruptedException {

		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Dev\\CodingClub\\CodingClub\\src\\com\\matladyhandsnam\\sorting\\test1.txt"));
		int amountNums = Integer.parseInt(br.readLine());
		int[] nums = new int[amountNums];
		for (int i = 0; i < amountNums; i++) {
			nums[i] = Integer.parseInt(br.readLine());

		}
		br.close();
		new BogoSort(nums);

	}

}
