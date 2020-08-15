package com.arrays;

import java.util.HashSet;

public class RemoveDuplicateElementsInArray {
	
	
	static int[] array = {1, 2, 5, 5, 6, 6, 7, 2};
	static HashSet list = new HashSet();
	public static void main(String ar[])
	{       
	    for(int i=0;i<array.length;i++)
	    {         
	      list.add(array[i]);

	    }
	    System.out.println(list);
	}}
