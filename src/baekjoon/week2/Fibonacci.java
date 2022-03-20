package baekjoon.week2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		int temp;
		int num = Integer.parseInt(sc.nextLine());
		
		if (num == 0)
			System.out.println(0);
		if (num == 1)
			System.out.println(1);
		if (num > 1) {
			for(int i = 1; i < num; i++) {
				temp = num2;
				num2 = num1 + num2;
				num1 = temp;
			}
			System.out.println(num2);
		}
	}
}
