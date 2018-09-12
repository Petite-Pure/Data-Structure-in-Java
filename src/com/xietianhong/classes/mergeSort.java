package com.xietianhong.classes;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};
		int[] temp = new int[20];
		sort(arr, 0, arr.length - 1, temp);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	
	public static void sort(int[] arr, int left, int right, int[] temp) {
		
		if(left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid, temp);				//左半部分排好序
			sort(arr, mid + 1, right, temp);			//右半部分排好序
			mergeArray(arr, left, mid, right, temp);		//合并左右部分
		}
		
	}
	
	
	public static void mergeArray(int[] arr, int left, int mid, int right, int[] temp) {
		
		int i = left;
		int m = mid;
		int j = mid + 1;
		int n = right;
		int k = 0;
		
		while (i <= m && j <= n) {
			
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
			
		}
		
		while (i <= m) {
			temp[k++] = arr[i++];
		}
		
		while (j <= n) {
			temp[k++] = arr[j++];
		}
		
		
		for (int i2 = 0; i2 < k; i2++) {
			arr[left + i2] = temp[i2];
		}
		
	}

}
