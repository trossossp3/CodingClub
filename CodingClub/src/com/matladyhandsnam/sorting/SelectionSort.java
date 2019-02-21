package com.matladyhandsnam.sorting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
			print(arr);
		}
		

	}
	
	

	private static void print(int[] i) {
		for (int x : i) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Dev\\CodingClub\\CodingClub\\src\\com\\matladyhandsnam\\sorting\\test1.txt"));
		int amountNums = Integer.parseInt(br.readLine());
		int[] nums = new int[amountNums];
		for (int i = 0; i < amountNums; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		selectionSort(nums);
	}

}


