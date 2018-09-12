package com.xietianhong.classes;

public class bubbleSort {
	
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
		boolean flag;
		
		for (int i = 0, len = arr.length; i < len - 1; i++) {
			flag = false;
			for (int j = len - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1]= temp;
					flag = true;		//这一趟进行过交换
				}
			}
			if (!flag) {
				break;		//这一趟没有进行过交换，说明已排序好。
			}
		}
	}
}
