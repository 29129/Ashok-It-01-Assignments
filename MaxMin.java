package com.assign;

/*Write a Java Program to find Min and Max elements in given Array?
Input:  1, 2, 5, 5, 6, 6, 7, 2
Output:   Min : 1  Max : 7
*/

public class MaxMin {
		
		 public  int getMin(int[] arr){ 
			    int minimum =arr[0]; 
			    for(int i=1;i<arr.length;i++){ 
			      if(arr[i] < minimum){ 
			        minimum = arr[i]; 
			      } 
			    } 
			    return minimum; 
			
		}
		
		public int getMax(int[] arr){ 
		    int maximum = arr[0]; 
		    for(int i=1;i < arr.length;i++){ 
		      if(arr[i] > maximum){ 
		         maximum = arr[i]; 
		      } 
		    } 
		    return maximum;
		  }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2 };
		MaxMin mx = new MaxMin();
		int max = mx.getMax(arr);
		System.out.println("Max : " + max);	
	    int min = mx.getMin(arr);
	    System.out.println("Min : " + min);
	}
	}
