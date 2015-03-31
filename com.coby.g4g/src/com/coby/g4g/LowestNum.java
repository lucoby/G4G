package com.coby.g4g;

public class LowestNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((int) "12345".charAt(3) - 49);
		
		lowestNum("4325043",3);
		lowestNum("765028321",5);
		lowestNum("121198",1);
		lowestNum("12345",2);
		
	}
	
	public static void lowestNum(String str, int n) {
		String res = "";
		int len = str.length();
		int minInd;
		
		while (n > 0 && len > n) {
			minInd = 0;
			
			for (int i = 0; i <= n; i++) {
				if (str.charAt(i) < str.charAt(minInd)) {
					minInd = i;
				}
			}
			
			res = res + str.charAt(minInd);
			n = n - minInd;
			str = str.substring(minInd + 1);
			len = len - minInd - 1;
		}
		
		if (n == 0) res = res + str;
		System.out.println(res);
	}
}
