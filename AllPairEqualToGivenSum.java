package com.arrays;


public class AllPairEqualToGivenSum {
	

   
    static void printPairs(int arr[], 
                           int n, int sum) 
    { 
       
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                if (arr[i] + arr[j] == sum) 
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")"); 
    } 
  
   
    public static void main(String[] arg) 
    { 
        int arr[] =   {3, 6, 8, -8, 10, 8 } ; 
        int n = arr.length; 
        int sum = 16; 
        printPairs(arr, n, sum); 
    } 
} 
	         
