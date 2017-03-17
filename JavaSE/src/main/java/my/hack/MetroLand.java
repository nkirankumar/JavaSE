package my.hack;

public class MetroLand {
	public static void main(String args[]) {
		int[] p = { 1, 1, 1 };
		int[] x = { 5, 2, 3 };
		int[] y = { 3, 4, 7 };

		/*
		 * int[] p={1,1}; int[] x={1,2}; int[] y={1,2};
		 */
		int max = findMax(x, y);
		int n = p.length;
		int minCost = Integer.MAX_VALUE;
		for (int i = 0; i <= max; i++) {
			for (int j = 0; j <= max; j++) {
				int cost = 0;
				int distance = 0;
				int totalcost = 0;
				for (int k = 0; k < n; k++) {					
					distance = Math.abs(x[k] - i) + Math.abs(y[k] - j);
					cost = distance * p[k];
					totalcost = totalcost + cost;

				}
				if (minCost > totalcost) {
					minCost = totalcost;
				}				
			}
		}
		System.out.println("MinCost = " + minCost);		

	}

	private static int findMax(int[] x, int[] y) {
		int max1 = 0;
		for (int i = 0; i < x.length; i++) {
			if (max1 <= x[i]) {
				max1 = x[i];
			}
		}
		int max2 = 0;
		for (int i = 0; i < y.length; i++) {
			if (max2 <= x[i]) {
				max2 = y[i];
			}
		}
		if (max1 >= max2) {
			return max1;
		}
		return max2;
	}

}
