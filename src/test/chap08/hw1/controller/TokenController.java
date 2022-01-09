package test.chap08.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {

		StringTokenizer t = new StringTokenizer(str," ");
		
		String s = "";
		while (t.hasMoreTokens()) {
			s += t.nextToken();
			
		}
		
		return s;
	}

	public String firstCap(String str) {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str.substring(0, 1).toUpperCase());
		sb.append(str.substring(1, str.length()));
			
		return sb.toString();
	}

	public int findChar(String str, char ch) {
		
		int count = 0;

			
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				count++;
			}
		}
			
		return count;
	}

}
