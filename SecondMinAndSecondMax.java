package com.arrays;

import java.util.Arrays;

public class SecondMinAndSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 int [] arr =  {1,2,5,9,6,4,7,2};     
	      int length=arr.length;
		 
		 Arrays.sort(arr);
		 
		 int secondMin=arr[1];
		 int secondMax=arr[length-1-1];
		 
		 System.out.println("secondMin in array="+secondMin);
		 System.out.println("secondMax in array="+secondMax);
		
	}

}
