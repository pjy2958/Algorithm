package baekjoon.week2;

import java.util.Scanner;

public class Filip2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		num1 =  (num1 % 10)*100 + ((num1 / 10) % 10) * 10 + ((num1 / 10) / 10);
		num2 =  (num2 % 10)*100 + ((num2 / 10) % 10) * 10 + ((num2 / 10) / 10);
		
		int result = num1 > num2 ? num1 : num2;
		System.out.println(result);
	}
}
