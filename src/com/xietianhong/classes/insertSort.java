package com.xietianhong.classes;

public class insertSort {

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
			
			for (int j = i + 1; j > 0; j--) {
				
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				else {
					break;		//不需要交换
				}
				
			}
			
		}
	}
}
