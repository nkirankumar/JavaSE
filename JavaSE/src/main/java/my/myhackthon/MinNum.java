package my.myhackthon;

public class MinNum {
	public static void main(String args[]) {
		// System.out.println(minNum(3, 5, 1));
		System.out.println(minNum(4, 5, 1));

	}

	public static int minNum(int A, int P, int K) {
		int day = 0;
		int pk = 0;
		int pa = pk + P;
		while (pa >= pk) {
			pa = pa + A;
			pk = pk + K;
			if (pa < pk) {
				day = day + 1;
				break;
			} else {
				day = day + 1;
			}
		}
		return day;
	}

}
