package test.chap08.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	
	
	public SpaceUpper() {
		// TODO Auto-generated constructor stub
	}

	public void spaceToUpper() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하시오(띄어쓰기 포함): ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		
		
		while (st.hasMoreTokens()) {
			String result = st.nextToken();
			sb.append(result.substring(0, 1).toUpperCase());
			sb.append(result.substring(1));
			sb.append(" ");
		}
		
		System.out.println(sb);
	}

}
