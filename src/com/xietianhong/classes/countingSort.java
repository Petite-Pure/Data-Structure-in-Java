package com.xietianhong.classes;

public class countingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};	
		arr = sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	public static int[] sort(int[] arr) {
		
		int[] temp = new int[arr.length];
		int max = arr[0];
		int min = arr[0];
		
		for (int i : arr) {
			if (max < i) {
				max = i;
			} 
			else if (min > i) {
				min = i;
			}
		}
		
		int[] cnt = new int[max - min + 1];
		
		//¼ÆÊý
		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i] - min]++;
		}
		
		
		for (int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[--cnt[arr[i] - min]] = arr[i];
		}
		
		return temp;
		
	}

}
