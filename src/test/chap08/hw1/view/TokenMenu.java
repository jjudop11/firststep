package test.chap08.hw1.view;

import java.util.Scanner;

import test.chap08.hw1.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while (true) {
			
			System.out.println("1. 지정문자열");
			System.out.println("2. 입력문자열");
			System.out.println("9. 프로그램종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				break;
			default:
				System.out.println("메뉴 다시 선택");
			}
		}
		
		
	}
	
	public void tokenMenu() {
		
		String str = "J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자: "+str);
		System.out.println("토큰 처리 전 개수: "+str.length());
		
		System.out.println("토큰 처리 후 글자: "+tc.afterToken(str));
		System.out.println("토큰 처리 후 개수: "+tc.afterToken(str).length());
		System.out.println("모두 대문자로 변환: "+tc.afterToken(str).toUpperCase());
		
		
	}
	
	public void inputMenu() {
		
		System.out.println("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		System.out.println("첫 글자 대문자: "+tc.firstCap(str));
		
		System.out.println("찾을 문자 하나를 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch+"가 들어간 개수: "+tc.findChar(str,ch));
		
	}
}
