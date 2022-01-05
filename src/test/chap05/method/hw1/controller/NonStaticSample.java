package test.chap05.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {
		
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i]= (int)(Math.random()*45)+1;
			
			for(int j = 0; j < lotto.length; j++) {
				
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
	public void outputChar(int num, char c) {
		
		for(int i = 1; i <= num; i++) {
			System.out.print(c+" ");
		}
		
	}
	
	public char alphabette() {
		

		while(true) {
			
			int ran = (int)(Math.random()*58)+65;
			
			if(65 <= ran && ran <= 90 || 97 <= ran && ran <= 122) {
				char ch = (char)ran;
				return ch;
			} 
			
		}
		
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		if(str.equals(" ")) {
			return null;
		}

		String result = str.substring(index1, index2);
		return result;

	}
		
}
