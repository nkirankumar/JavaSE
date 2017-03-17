package my.myhackthon;

import java.util.LinkedList;
import java.util.Queue;

public class ShowTickets {
	public static void main(String[] args) {
		//int tickets[] = { 5, 5, 2, 3 };//11
		//int p=3;		
		//int tickets[] = { 2, 6, 3, 4, 5 };//12
		//int p = 2;
		
		int tickets[] = { 1, 1, 1, 1};//1
		int p=0;
		
		waitingTime(tickets, p);

	}

	public static void waitingTime(int[] tickets, int p) {
		int x = tickets[p];

		int count = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < tickets.length; i++) {
			q.add(tickets[i]);

		}
		System.out.println(q.toString());
		while (x != 0 && p != 0) {
			int head = q.poll();
			if ((head - 1) != 0)
				q.add(head - 1);
			count++;
			p--;
			if (p == 0 && x != 0) {
				x--;
				p = q.size();
			}
			System.out.println(q.toString());

		}
		System.out.println(count + 1);

	}

}
