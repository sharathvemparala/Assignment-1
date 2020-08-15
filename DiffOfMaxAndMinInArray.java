package com.arrays;

import java.util.Arrays;

public class DiffOfMaxAndMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] arr = new int [] {2,5,1,7,3,9,5};     
	      int length=arr.length;
		 
		 Arrays.sort(arr);
		 System.out.println(arr[length-1]-arr[0]);
	}   
	        
	    
	}    
