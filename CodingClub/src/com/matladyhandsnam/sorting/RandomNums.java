package com.matladyhandsnam.sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RandomNums {

	private static void random(int n1, int n2, int n3) throws IOException {
		int[] arr = new int[n3];
		for (int i = 0; i < n3; i++) {
			if (n1 == 0)
				arr[i] = ((int) (Math.random() * (n2 + 1)));
			else {
				arr[i] = ((int) (Math.random() * ((n2 - n1) + 1) + n1));
			}

		}
		print(arr);
	}

	private static void print(int[] arr) throws IOException {
		

		FileWriter fileWriter = new FileWriter(
				"C:\\Dev\\CodingClub\\CodingClub\\src\\com\\matladyhandsnam\\sorting\\test1.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		for (int i = 0; i < arr.length; i++) {
			printWriter.write(arr[i] + ",");
		}
		printWriter.close();
	}

	public static void main(String[] args) throws IOException {
		int lowerBound = -100;
		int upperBound = 1001000;
		int amountNums = 50;
		random(lowerBound, upperBound, amountNums);
	}

}
