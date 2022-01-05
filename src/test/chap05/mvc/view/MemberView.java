package test.chap05.mvc.view;

import java.util.Scanner;

import test.chap05.mvc.controller.MemberController;


public class MemberView {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void meainMenu() {
		
		System.out.println("아이디 입력: ");
		String id = sc.nextLine();
		System.out.println("비번 입력: ");
		String pwd = sc.nextLine();
		
		int result = mc.login(id, pwd);
		
		if(result == 1) {
			
			while (true) {
				
				System.out.println("== 회원 프로그램 ==");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회");
				System.out.println("3. 키 수정");
				System.out.println("9. 프로그램 종료");
				System.out.println("메뉴 번호 선택: ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch (menu) {
				case 1:
					System.out.println(mc.readinfo().information());
					break;
				case 2:
					System.out.println(mc.readAge()); 
					break;
				case 3:
					updateHeight();
					break;
				case 9:
					System.out.println("프로그램 종료");
					return;
				default:
					System.out.println("다시 메뉴 선택: ");
				}
				
			}
		
		} else {
			return;
		}
		
			
		
	}

	private void updateHeight() {

		System.out.println("수정 키 입력: ");
		double height = sc.nextDouble();
		
		mc.updateHeight(height);
		
	}
}
