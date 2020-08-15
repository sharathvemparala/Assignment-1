package com.arrays;

public class ThirdLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,8,1,9,2,1,10};
		int length=a.length;
		thirdLargest(a,length);

	}

	 static void thirdLargest(int[] a, int length) {
		
		 if(length<3) {
			 System.out.println("Invalid output");
			
		 }
		 
		 int first=a[0];
		 for(int i=1;i<a.length;i++) {
			 
			 if(a[i] >first)
				first=a[i];
		 }
		 
		 int second=Integer.MIN_VALUE;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]>second && a[i] < first)
				 second=a[i];
			 
		 }
		 
		 
		 int third=Integer.MIN_VALUE;
		 for(int i=0;i<a.length;i++) {
			 if(a[i] > third && a[i]<second )
				 third=a[i]; 
		 }
		  System.out.printf("The third Largest " + "element is %d\n", third); 
		
	}

}
