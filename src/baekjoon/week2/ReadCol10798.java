package baekjoon.week2;

import java.util.Scanner;

public class ReadCol10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String s4 = sc.nextLine();
		String s5 = sc.nextLine();
		char[] s1Arr = new char[15];
		for (int i = 0; i < s1.length(); i++) {
			s1Arr[i] = s1.charAt(i);
		}
		char[] s2Arr = new char[15];
		for (int i = 0; i < s2.length(); i++) {
			s2Arr[i] = s2.charAt(i);
		}
		char[] s3Arr = new char[15];
		for (int i = 0; i < s3.length(); i++) {
			s3Arr[i] = s3.charAt(i);
		}
		char[] s4Arr = new char[15];
		for (int i = 0; i < s4.length(); i++) {
			s4Arr[i] = s4.charAt(i);
		}
		char[] s5Arr = new char[15];
		for (int i = 0; i < s5.length(); i++) {
			s5Arr[i] = s5.charAt(i);
		}
		String result = "";
		for(int i = 0; i <15; i++) {
			if(s1Arr[i] != 0)
				result += s1Arr[i];
			if(s2Arr[i] != 0)
				result += s2Arr[i];
			if(s3Arr[i] != 0)
				result += s3Arr[i];
			if(s4Arr[i] != 0)
				result += s4Arr[i];
			if(s5Arr[i] != 0)
				result += s5Arr[i];
		}
		System.out.println(result);
	}
}
