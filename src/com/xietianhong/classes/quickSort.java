package com.xietianhong.classes;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};
		sort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	
	//先从数列中取出一个数作为key值；
	//将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
	//对左右两个小数列重复第二步，直至各区间只有1个数。
	public static void sort(int[] arr, int l, int r) {
		
		if (l >= r) {
			return;
		}
		
		int i = l, j = r, key = arr[l];
		
		while (i < j) {
			
			while (i < j && arr[j] >= key)		//从右至左找出第一个小于key的值
				j--;
			if (i < j) {
				arr[i] = arr[j];
				i++;
			}
			
			while (i < j && arr[i] < key)		//从左至右找出第一个大于或等于key的值
				i++;
			if (i < j) {
				arr[j] = arr[i];
				j--;
			}
			
		}
		
		//i == j
		arr[i] = key;
		sort(arr, l, i - 1);
		sort(arr, j + 1, r);
	}

}
