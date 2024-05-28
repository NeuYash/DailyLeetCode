package com.leetcode;
//O(n) O(1)
public class ApplyDiscountToPrices {
	class Solution {
		public String discountPrices(String sentence, int discount) {
			int idx = 0;
			StringBuilder sb = new StringBuilder();
			String[] str = sentence.split(" ");
			for (String cur : str) {
				// if (valid(cur)) {
				// Long value = Long.parseLong(cur.substring(1));
				// sb.append('$' + String.format("%.2f", value * (1 - discount / 100.0d)));
				// } else
				// sb.append(cur);
				// sb.append(" ");
				if (cur.charAt(0) == '$' && isLong(cur.substring(1))) {
					Long value = Long.parseLong(cur.substring(1));
					sb.append('$' + String.format("%.2f", value * (1 - discount / 100.0d)));
				} else
					sb.append(cur);
				sb.append(" ");
			}
			return sb.substring(0, sb.length() - 1).toString();
		}

		private boolean valid(String s) {
			if (s.charAt(0) != '$')
				return false;
			else if (s.length() <= 1)
				return false;
			else {
				for (int i = 1; i < s.length(); i++)
					if (!Character.isDigit(s.charAt(i)))
						return false;
			}
			return true;
		}

		public boolean isLong(String s) {
			try {
				Long.parseLong(s);
			} catch (NumberFormatException e) {
				return false;
			} catch (NullPointerException e) {
				return false;
			}
			return true;
		}
	}
}
