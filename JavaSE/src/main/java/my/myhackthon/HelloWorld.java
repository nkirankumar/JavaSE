package my.myhackthon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HelloWorld {
	// arguments are passed using the text field below this editor
	static int cnt = 0;
	static int toachieve = 1;

	public static void main(String[] args) {
		String str = "rrlrlr";
		Set<String> set = new HashSet<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();

		// intcnt=0;
		map.put("r", 1);
		map.put("l", -1);

		int sum = 0;

		System.out.println(str.length());
		for (int c = 0; c < str.length(); c++) {
			for (int i = 1; i <= str.length() - c; i++) {
				String sub = str.substring(c, c + i);
				// set=possiblePaths(sub,set,map);
				System.out.println(sub);
			}
		}

		System.out.println(set);
		System.out.println(cnt);

	}

	static Set<String> possiblePaths(String substr, Set<String> set,
			Map<String, Integer> map) {
		int i = 0;
		int sum = 0;
		String s = "";
		// System.out.println(substr);
		for (char c : substr.toCharArray()) {
			// System.out.println(String.valueOf(c));
			sum = sum + map.get(String.valueOf(c));
			s = s + String.valueOf(c);
			if (sum == toachieve && !set.contains(s)) {
				cnt++;
				// sum =0;
				set.add(s);
				// System.out.println(set);
				// s="";
			}

		}
		// System.out.println(cnt+"----------------------------------");
		return set;
	}

}
