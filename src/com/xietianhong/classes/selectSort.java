package com.xietianhong.classes;

public class selectSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void sort(int[] arr) {
		
		int temp = 0;
		
		for (int i = 0, len = arr.length; i < len - 1; i++) {
			
			int minIndex = i;
			
			for (int j = i + 1; j < len; j++) {
				
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
				
			}
			
			if (minIndex != i) {
				temp = arr[i];
				arr[i]= arr[minIndex]; 
				arr[minIndex] = temp;
			}
		}
	}

}
