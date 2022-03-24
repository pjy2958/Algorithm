package baekjoon.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class homunculus2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		List<Integer> homun = new <Integer>ArrayList();
		
		for(int i = 0; i < 9; i++) {
			int num = Integer.parseInt(sc.nextLine());
			homun.add(num);
			sum += num;
		}
		aa: for (int i = 0; i < homun.size() - 1; i++) {
			for (int j = i + 1; j < homun.size(); j++) {
				int temp = homun.get(i) + homun.get(j);
				if (sum - temp == 100) {
					homun.remove(i);
					homun.remove(j-1);
					break aa;
				}
			}
		}
		Collections.sort(homun);
		for(int a : homun) {
			System.out.println(a);
		}
	}
}
