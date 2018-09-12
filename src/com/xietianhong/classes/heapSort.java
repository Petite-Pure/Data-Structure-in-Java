package com.xietianhong.classes;

public class heapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 85, 45, 13, 11, 45, 23, 13, 55, 77};
		sort(arr,arr.length);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	public static void sort(int[] arr, int n) {
		int temp = 0;
		//构建最大堆
		buildMaxHeap(arr, n);
		
		//进行调整后，堆顶元素为最大值，将最大值与堆尾部元素交换
		for (int i = n - 1; i > 0; i--) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			//此时的堆被破坏,重新调整为最大堆
			maxHeapFixdown(arr, 0, i);
		}
	}
	
	
	//构建最大堆
	public static void buildMaxHeap(int[] arr, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--) {
			maxHeapFixdown(arr, i, n);
		}
	}
	
	public static void maxHeapFixdown(int[] arr, int i, int n) {
		int j = i * 2 + 1;		//i的子节点
		int temp = 0;
		
		while (j < n) {
			//在左右子节点中找到最大的
			if (j + 1 < n && arr[j + 1] > arr[j]) {
				j++;
			}
			
			if (arr[i] >= arr[j] ) {
				break;
			}
			
			//较大节点上移
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i = j;
			j = i * 2 + 1;
		}
	}

}
