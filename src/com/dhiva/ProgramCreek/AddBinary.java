package com.dhiva.ProgramCreek;

public class AddBinary {
	public String binaryAddition(String s1, String s2) {
		if (s1 == null || s1.length() == 0)
			return s2;
		if (s2 == null || s2.length() == 0)
			return s1;
		int len1 = s1.length() - 1;
		int len2 = s2.length() - 1;
		int flag = 0;
		StringBuilder sb = new StringBuilder();
		while (len1 >= 0 || len2 >= 0) {
			int va = 0;
			int vb = 0;
			if (len1 >= 0) {
				va = s1.charAt(len1) == '0' ? 0 : 1;
				len1--;
			}
			if (len2 >= 0) {
				vb = s2.charAt(len2) == '0' ? 0 : 1;
				len2--;
			}
			int sum = va + vb + flag;
			if (sum >= 2) {
				sb.append(String.valueOf(sum - 2));
				flag = 1;
			} else {
				flag = 0;
				sb.append(String.valueOf(sum));
			}
		}

		if (flag == 1) {
			sb.append("1");
		}
		String reversed = sb.reverse().toString();
		return reversed;

	}
}
