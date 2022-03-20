package baekjoon.week2;

import java.util.Scanner;

public class PlusCycle1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int newNum = ((n % 10) * 10) + ((n / 10 + n % 10) % 10);;
		
		while (true) {
			cnt ++;
			if(n == newNum)
				break;
			newNum = ((newNum % 10) * 10) + ((newNum / 10 + newNum % 10) % 10);
		}
		System.out.println(cnt);
	}
}
