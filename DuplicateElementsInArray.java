package com.arrays;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {1,2,5,5,6,6,7,2};
		System.out.print("Duplicate elements in an array:");
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j])
				System.out.print(a[j]+ " ");
			}
			
			
		}

	}

}
