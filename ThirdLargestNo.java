package com.assign;

public class ThirdLargestNo {

	public static void main(String[] args) {

		int temp, size;
		int arr[] = { 6, 8, 1, 9, 2, 1, 10 };
		size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Third Largest no is " + arr[size - 3]);
	}
}
