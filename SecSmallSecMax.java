package com.assign;

public class SecSmallSecMax {
	/*Write Java Program to find second Min and Second Max elements in given Array ?

Input: 1, 2, 5, 9, 6, 4, 7, 2
Output: Second Min-2  Second Max-7
*/
		public static int getSecondMin(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		
		
		public static int getSecondMax(int[] a, int total){  
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a[i] < a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        }  
			       return a[1];
			}  
		public static void main(String args[]){  
		 int []arr= { 1, 2, 5, 9, 6, 4, 7, 2};
		System.out.println("Second Min: "+getSecondMin(arr,8));  
		System.out.println("Second Min: "+getSecondMax(arr,8));  
		}
		}  
