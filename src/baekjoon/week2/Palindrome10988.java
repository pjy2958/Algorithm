package baekjoon.week2;

import java.util.Scanner;

class Solution10988 {
	int sol(String str) {
		int mid;
		if((str.length() % 2) == 0) {
			mid = str.length()/2;
			for(int i = 0; i <= mid; i++) {
				if(str.charAt(i) != str.charAt(str.length()-1-i))
					return 0;
			}
			return 1;
		} else {
			mid = str.length()/2 + 1;
			for(int i = 0; i < mid; i++) {
				if(str.charAt(i) != str.charAt(str.length()-1-i))
					return 0;
			}
			return 1;
		}
	}
}

public class Palindrome10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Solution10988 sol = new Solution10988();
		System.out.println(sol.sol(str));
	}
}
