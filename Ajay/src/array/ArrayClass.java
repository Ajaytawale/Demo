package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		
		int arry[] = {45,6,78,98,0};
		int arr[] = {45,6,78,98,0};
		
		Arrays.sort(arr);
		boolean flag = Arrays.equals(arry, arr);
		System.out.println(flag);
		// equal checked ary
		System.out.println("---------------------------------------------");

		int c= 3;
		int b= 3;
		System.out.println("---------------------------------------------");
	
		boolean ff = c==b;
		System.out.println(ff);
		// index return int
		int a= arry[3];
		arry[3]= 789;
		System.out.println("---------------------------------------------");
	//== not work with arry 
		boolean f = arr == arry;
	
		System.out.println(f);
		
		
		
		System.out.println("---------------------------------------------");
		
		//this is not right way to execute but by using index we can check arrys equal or not but we can write only single inderx in column
		boolean z = arr[0] == arry[0];
		System.out.println(z);
		
		System.out.println("---------------------------------------------");

		//directly print value by using index in arry column
		System.out.println(arry[3]);
		
		
		System.out.println("---------------------------------------------");
		
		// sorting in arry 
		
		Arrays.sort(arr);
		// Array arr sorting has been done by ascending order.
		
		

	}

}
