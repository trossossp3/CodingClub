package com.matladyhandsnam.sorting;

import java.util.ArrayList;

public class test {		
		
	private static void random(int n1, int n2, int n3){
		int[] arr = new int[n3];
		for (int i = 0; i < n3; i++){
			if (n1 == 0)
				arr[i]=((int) (Math.random() * (n2 + 1)));
			else{
				arr[i]=((int) (Math.random() * ((n2 - n1) + 1) + n1));
			}
				
		} print(arr);
	}
	private static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1001000;
		int n3 = 10;
		random(n1, n2, n3);
	}

}

