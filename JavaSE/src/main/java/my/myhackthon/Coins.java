package my.myhackthon;

public class Coins {
	public static void main(String args[]) {
		int coins[]={2,5,8,3};//1 2 3 2		
		for (int i = 0; i < coins.length; i++) {

			int count = 0;
			for (int j = 0; j <= i; j++) {
				if (coins[i] > j) {
					count++;
					coins[i] = coins[i] - j;
				}
			}
			System.out.println(count);

		}
	}

}
