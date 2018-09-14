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
				
		int[][] cnt = new int[10][arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if (cnt[arr[i] / 10][j] == 0) {
					cnt[arr[i] / 10][j] = arr[i];
					break;
				}
			}
		}
		
		for (int i = 0, k = 0; i < 10; i++) {
			
			int count = 0;
			
			if (cnt[i][0] != 0) {
				for (int j = 0; j < arr.length; j++) {
					if (cnt[i][j] != 0) {
						count++;
					} else {
						break;
					}
				}
				
				int[] temp = new int[count];
				
				for (int j = 0; j < temp.length; j++) {
					if (cnt[i][j] != 0) {
						temp[j] = cnt[i][j];
					} else {
						break;
					}
				}
				
				//利用插入排序把桶中的数字排好序
				insertSort.sort(temp);
				
//				for (int j : temp) {
//					System.out.println(j);
//				}
				
				
				for (int j = 0; j < temp.length; j++) {
					arr[k++] = temp[j];
				}
			}
			
		}
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.println(cnt[i][j]);
//			}
//		}
		
		
		
	}

}
