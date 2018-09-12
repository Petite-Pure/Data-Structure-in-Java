package com.xietianhong.classes;

public class shellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	//根据某一增量分为若干子序列，并对子序列分别进行插入排序。
	public static void sort(int[] arr) {
		
		int temp = 0;
		int len = arr.length;
		int incre = len;
		
		while (true) {
			
			incre /= 2;
			
			for (int k = 0; k < incre; k++) {
				
				for (int i = k + incre; i < len; i += incre) {
					
					for (int j = i; j > k; j -= incre) {
						
						if (arr[j]<arr[j - incre]) {
							temp = arr[j - incre];
							arr[j-incre] = arr[j];
							arr[j] = temp;
						}
						else {
							break;
		                }

					}
					
				}
				
			}
			
			if (incre == 1) {
				break;
			}
		
		}
	}

}
