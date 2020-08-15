package com.assign;

public class MaxDiffBet2Element {

	int temp, size;

	/*
	 * Write a java program to find maximum difference between two elements in given
	 * Array? Input = { 2, 5, 1, 7, 3, 9, 5} Output = 8
	 */
	public void diff() {
		  int[] arr = { 2, 5, 1, 7, 3, 9, 5 };
		//int[] arr = { 9, 2, 12, 5, 4, 7, 3, 19, 5 };

		size = arr.length;
		int diff = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				diff = Integer.max(diff, arr[j] - arr[i]);

			}
		}
		System.out.println(+diff);
	}

	public static void main(String[] args) {

		MaxDiffBet2Element mx = new MaxDiffBet2Element();

		mx.diff();

	}

}
