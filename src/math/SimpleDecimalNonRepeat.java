package math;

import java.util.HashMap;

public class SimpleDecimalNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String answer = fractionToDecimal(16, 13);

		System.out.println("ans==" + answer);
	}

	public static String fractionToDecimal(int n, int d) {

		if (n == 0)
			return "0";

		long num = Math.abs((long) n);
		long den = Math.abs((long) d);

		StringBuilder ans = new StringBuilder();

		long quotient = num / den;
		long rem = num % den;
		ans.append(quotient);

		if (rem == 0) {
			return ans.toString();
		} else {
			ans.append(".");
			HashMap<Long, Integer> hashmap = new HashMap<Long, Integer>();

			while (rem != 0) {
				if (hashmap.containsKey(rem)) {
					int pos = hashmap.get(rem);
					ans.insert(pos, "(");
					ans.append(")");
					break;
				} else {
					hashmap.put(rem, ans.length());

					rem = rem * 10;
					quotient = rem / den;
					rem = rem % den;
					ans.append(quotient);
				}
			}

		}

		return ans.toString();
	}

}
