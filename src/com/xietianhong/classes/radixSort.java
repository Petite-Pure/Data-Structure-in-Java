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
		
		//A[]Ϊԭ����
		//temp[]Ϊ��ʱ����
		//nΪ���е����ָ���
		//kΪ���λ��
		//rΪ����10
		//cnt[]�洢bin[i]�ĸ���
		
		
		for (int i = 0, rtok = 1; i < k; i++, rtok *= r) {
			
			//��ʼ��
			for (int j = 0; j < r; j++) {
				cnt[j] = 0; 
			}
			
			//����ÿ�����ӵ����ָ���
			for (int j = 0; j < n; j++) {
				cnt[(arr[j] / rtok) % r]++;
			}
			
			//cnt[j]�ĸ����޸�Ϊǰj������һ���м�����
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
