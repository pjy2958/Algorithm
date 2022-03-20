package baekjoon.week2;

import java.util.Scanner;

public class XthanLownumber10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		n = sc.nextInt();
		x = sc.nextInt();
		int[] nArr = new int[n];
		for(int i = 0; i < nArr.length; i++) {
			nArr[i] = sc.nextInt();
		}
		for(int i = 0; i < nArr.length; i ++) {
			if(nArr[i] < x)
				System.out.print(nArr[i] + " ");
		}
	}
}
