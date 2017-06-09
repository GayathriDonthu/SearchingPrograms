package com.search;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n = scan.nextInt();
		System.out.println("Enter the elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the search element:");
		int element = scan.nextInt();
		
		int count;
		for(count=0; count<n ;count++){
			if(arr[count] == element){
				System.out.println("Number found at index:" + count);
				break;
			}
		}
		
		if(count == n)
			System.out.println("Number not found");
		
		
		
	}
}
