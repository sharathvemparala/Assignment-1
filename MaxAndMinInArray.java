package com.arrays;

import java.util.Arrays;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int [] arr =  {1,2,5,5,6,6,7,2};     
	      int length=arr.length;
		 
		 Arrays.sort(arr);
		 
		 int min=arr[0];
		 int max=arr[length-1];
		 
		 System.out.println("Max in array="+max);
		 System.out.println("Min in array="+min);
	}

}
