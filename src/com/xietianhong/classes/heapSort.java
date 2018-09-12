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
		//��������
		buildMaxHeap(arr, n);
		
		//���е����󣬶Ѷ�Ԫ��Ϊ���ֵ�������ֵ���β��Ԫ�ؽ���
		for (int i = n - 1; i > 0; i--) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			//��ʱ�Ķѱ��ƻ�,���µ���Ϊ����
			maxHeapFixdown(arr, 0, i);
		}
	}
	
	
	//��������
	public static void buildMaxHeap(int[] arr, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--) {
			maxHeapFixdown(arr, i, n);
		}
	}
	
	public static void maxHeapFixdown(int[] arr, int i, int n) {
		int j = i * 2 + 1;		//i���ӽڵ�
		int temp = 0;
		
		while (j < n) {
			//�������ӽڵ����ҵ�����
			if (j + 1 < n && arr[j + 1] > arr[j]) {
				j++;
			}
			
			if (arr[i] >= arr[j] ) {
				break;
			}
			
			//�ϴ�ڵ�����
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i = j;
			j = i * 2 + 1;
		}
	}

}
