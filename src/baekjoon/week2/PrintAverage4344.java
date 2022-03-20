package baekjoon.week2;

import java.util.Scanner;

class Solution4344{
	float sol(int n, int[] arr) {
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		float average = sum / n;
		for(int i = 0; i < n; i++) {
			if(arr[i] > average)
				cnt++;
		}
		return ((float)cnt / (float) n * 100);
	}
}
public class PrintAverage4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution4344 sol = new Solution4344();
		int c = Integer.parseInt(sc.nextLine());
		float[] result = new float[c];
		
		for(int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int[] averageArr = new int[n];
			for(int j = 0; j < n; j++) {
				averageArr[j] = sc.nextInt();
			}
			result[i] = sol.sol(n, averageArr);
		}
		for(int i = 0; i < c; i++) {
			System.out.printf("%.3f", result[i]);
			System.out.print("%\n");
		}
	}
}
