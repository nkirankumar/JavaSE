package my.myhackthon;

public class Xor {
	public static void main(String a[]) {
		System.out.print(maxXor(2,4,8));//7
		System.out.print(maxXor(1,3,3));//3	

	}

	static int maxXor(int left, int right, int k) {
		int max = 0;
		for (int i = left; i <= right; i++) {
			int a = i;
			for (int j = a + 1; j <= right; j++) {
				int b = j;
				int max1 = a ^ b;
				if ((max1 > max) && (max1 <= k))
					max = max1;
			}
		}
		return max;
	}

}
