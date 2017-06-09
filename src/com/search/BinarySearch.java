package com.search;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * @author gayathri.guttikonda
 * 
 * Binary Search is useful for searching sorted data
		1. It is faster than sequential search
		2. It reduces the span of searching the value
		3. Steps involved in Binary Search:
		4. Compare the value at middle, otherwise divide the data into two parts at the middle
		5. If the value to be searched is less than (<) the value at middle, then search in the fist half otherwise in the next half

 *
 */
public class BinarySearch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n = scan.nextInt();
		System.out.println("Enter the elements;");
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the element to be searched");
		int key = scan.nextInt();
		
		int found = binarySearch(arr,key);
		
		if(found == -1)
			System.out.println("Key not found");
		else
			System.out.println("Key found at index:"+found);
		
	}
	
	public static int binarySearch(int[] array, int key){
		
		int start = 0;
		int end = array.length - 1;
		
		while(start <= end){
			int mid = (start + end)/2;
			
			if(key == array[mid])
				return mid;
			else if(key < array[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
