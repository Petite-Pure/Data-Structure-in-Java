package com.xietianhong.classes;

public class bucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	public static void sort(int[] arr) {
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			else if (min > arr[i]) {
				min = arr[i];
			} 
		}
		
		int[] cnt = new int[max - min + 1];
		
		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i] - min]++;
		}
		
		for (int i = 0,j = 0; i < cnt.length; i++) {
			while (cnt[i] != 0) {
				arr[j++] = i + min;
				cnt[i]--;
			}
		}
		
	}

}
