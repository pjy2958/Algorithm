package baekjoon.week2;

import java.util.Arrays;
import java.util.Scanner;

public class Croatia2941 {

	public static void main(String[] args) {
		final int MAX = 100;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = new String[MAX];
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			strArr[i] = Character.toString(str.charAt(i));
		}

		for (int i = 0; i < str.length(); i++) {
			if(i < str.length()-1) {
				String a = strArr[i] + strArr[i+1];
				if (Arrays.asList(croatia).contains(a)) {
					cnt++;
					i += 1;
				} else if(i < str.length()-2) {
					String b = strArr[i] + strArr[i+1] + strArr[i+2];
					if(Arrays.asList(croatia).contains(b)) {
						cnt++;
						i += 2;
					} else
						cnt ++;
				} else
					cnt++;
			} else
				cnt ++;
		}
		System.out.println(cnt);
	}
}
