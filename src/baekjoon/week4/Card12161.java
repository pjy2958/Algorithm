package baekjoon.week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card12161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		int lastCardNum = Integer.parseInt(sc.nextLine());
		
		for(int cardNum = 0; cardNum < lastCardNum; cardNum++) {
			que.add(cardNum + 1);
		}
		
		while(true) {
			System.out.print(que.poll() + " ");
			if(que.size() == 0)
				break;
			que.add(que.poll());
		}
	}
}