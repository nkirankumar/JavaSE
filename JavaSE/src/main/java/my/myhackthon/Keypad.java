package my.myhackthon;

public class Keypad {

	public static void main(String[] args) {
		//String s = "423692";
		//String keypad = "923857614";
		
		//String s = "5111";
		//String keypad = "752961348";
		
		String s = "91566165";
		String keypad = "639485712";
		
		int tim = entryTime(s, keypad);
		System.out.println("maximum sum is :" + tim);
	}

	public static int entryTime(String s, String keypad) {
		int count = 0, maxsum = 0;
		char s1[][] = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s1[i][j] = keypad.charAt(count);
				count++;
			}

		}

		int[][] indexes = new int[s.length()][2];
		for (int k = 0; k < s.length(); k++) {

			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++) {
					if (s1[i][j] == s.charAt(k)) {
						indexes[k][0] = i;
						indexes[k][1] = j;
						// System.out.println(s.charAt(k)+"\t"+indexes[k][0]+"\t"+indexes[k][1]);
						break;
					}
				}

		}
		// System.out.println("------------------");
		for (int i = 0; i < s.length(); i++) {
			// System.out.println(i);
			if (i < s.length() - 1) {
				int sum1 = Math.abs(indexes[i][0] - indexes[i + 1][0]);
				int sum2 = Math.abs(indexes[i][1] - indexes[i + 1][1]);
				if (sum1 > sum2)
					maxsum += sum1;
				else
					maxsum += sum2;
			}
		}

		return maxsum;
	}

}
