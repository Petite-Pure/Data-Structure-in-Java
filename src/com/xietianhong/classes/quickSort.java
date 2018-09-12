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
	
	
	
	//�ȴ�������ȡ��һ������Ϊkeyֵ��
	//���������С����ȫ������������ߣ����ڻ����������ȫ�����������ұߣ�
	//����������С�����ظ��ڶ�����ֱ��������ֻ��1������
	public static void sort(int[] arr, int l, int r) {
		
		if (l >= r) {
			return;
		}
		
		int i = l, j = r, key = arr[l];
		
		while (i < j) {
			
			while (i < j && arr[j] >= key)		//���������ҳ���һ��С��key��ֵ
				j--;
			if (i < j) {
				arr[i] = arr[j];
				i++;
			}
			
			while (i < j && arr[i] < key)		//���������ҳ���һ�����ڻ����key��ֵ
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
