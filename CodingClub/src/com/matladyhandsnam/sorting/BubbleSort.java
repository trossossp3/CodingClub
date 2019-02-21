package com.matladyhandsnam.sorting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BubbleSort {

	public static void bubble(int array[]) {
		int n = array.length;
		int k;
		for (int j = n; j >= 0; j--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					swap(i, k, array);
				}
			}
			print(array);

		}
	}

	private static void swap(int i, int j, int[] array) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void print(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Dev\\CodingClub\\CodingClub\\src\\com\\matladyhandsnam\\sorting\\test1.txt"));
		int amountNums = Integer.parseInt(br.readLine());
		int[] nums = new int[amountNums];
		for (int i = 0; i < amountNums; i++) {
			nums[i] = Integer.parseInt(br.readLine());

		}
		br.close();
		bubble(nums);
	}



}