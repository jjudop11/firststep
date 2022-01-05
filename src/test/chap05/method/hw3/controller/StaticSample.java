package test.chap05.method.hw3.controller;

public class StaticSample {
	
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() {
		
		value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		
		char[] ch = new char[value.length()];
		
		for(int i = 0; i < ch.length; i++) {
			
			if(i == index) {
				ch[i] = c; 
			} else {
				ch[i] = value.charAt(i); 
			}
		}
		/*
		char[] cArr = value.toCharArray();
		
		cArr[index] = c;
		 */
		value = String.valueOf(ch);
	}
	
	public static int valueLength() {
		
		return value.length();
		
	}
	
	public static String valueConcat(String str) {
		
		String str2 = value + str;
		return str2;
	}
}
