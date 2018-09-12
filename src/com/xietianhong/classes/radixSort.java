package com.xietianhong.classes;

public class radixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};
		int[] temp = new int[10];
		int[] cnt = new int[10];
		int n = arr.length;
		int k = 2;
		int r = 10;
		sort(arr, temp, n, k, r, cnt);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	public static void sort(int[] arr, int[] temp, int n, int k, int r, int[] cnt) {
		
		//A[]为原数组
		//temp[]为临时数组
		//n为序列的数字个数
		//k为最大位数
		//r为基数10
		//cnt[]存储bin[i]的个数
		
		
		for (int i = 0, rtok = 1; i < k; i++, rtok *= r) {
			
			//初始化
			for (int j = 0; j < r; j++) {
				cnt[j] = 0; 
			}
			
			//计算每个箱子的数字个数
			for (int j = 0; j < n; j++) {
				cnt[(arr[j] / rtok) % r]++;
			}
			
			//cnt[j]的个数修改为前j个箱子一共有几个数
			for (int j = 1; j < r; j++) {
				cnt[j] += cnt[j - 1];
			}
			
			for (int j = n - 1; j >= 0; j--) {
				cnt[(arr[j] / rtok) % r]--;
				temp[cnt[(arr[j] / rtok) % r]] = arr[j];
			}
			
			for (int j = 0; j < n; j++) {
				arr[j]= temp[j]; 
			}
			
		}
		
	}

}
