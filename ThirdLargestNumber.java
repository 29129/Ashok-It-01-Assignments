package com.assign;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class ThirdLargestNumber {

	int temp, size;

	public void array1() {
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

	public void array2() {

		int arr[] = { 6, 8, 1, 9, 2, 1, 10, 12 };
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
	
	
	
	public void array3()
	{
		
		int [] a = {6};
		size=a.length;
		if(size<= 3)
		{
		System.out.println("Invalid Input, array size is less than 3");
		
		}
		
	}

	/*
	 * Write a java program to find maximum difference between two elements in given
	 * Array? Input = { 2, 5, 1, 7, 3, 9, 5} Output = 8
	 */
	
	
	public void method4()
	{
		
		
		
		
				
	}
	public static void main(String[] args) {

		ThirdLargestNumber t = new ThirdLargestNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 1. Array1 \n 2.Array2 \n 3. Array3");
		System.out.println("plz enter your choice");
		int ch = sc.nextInt();
		switch (ch) {

		case 1:
			t.array1();
			break;

		case 2:
			t.array2();
			break;
			
		case 3:
			t.array3();

		break;
		default:

		}
	}

}
