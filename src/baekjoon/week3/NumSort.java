package baekjoon.week3;

import java.util.Scanner;

public class NumSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
			
		for(int i = 0; i < arr.length - 1; i ++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i : arr)
			System.out.println(i);
	}
}
