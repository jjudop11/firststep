package test.chap07.mvc.view;

import java.util.Scanner;

import test.chap07.mvc.controller.LibraryManager;
import test.chap07.mvc.model.vo.Book;
import test.chap07.mvc.model.vo.Member;



public class LibraryMenu {
	
	LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);
	
	public LibraryMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별M/F: ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		
		Member m = new Member(name, age, gender);
		lm.insertMember(m);
		
		while (true) {
			
			System.out.println("=== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여");
			System.out.println("0. 프로그램 종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				System.out.println(lm.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("메뉴 다시 선택");
			
			}
			
			
		}
		
	
	}

	private void selectAll() {
		
		Book[] bList = lm.selctAll();
		
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i+"번도서: "+bList[i].toString());
		}
		
	
	}

	private void searchBook() {

		System.out.println("검색할 제목 키워드: ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		
		for(Book b : searchList) {
		
			if(b == null) {
				System.out.println("검색 결과 없음");
				break;
				
			} else {
				System.out.println(b.toString());
			}
			
			
		}
		
		
	}

	private void rentBook() {
		
		selectAll();
		
		System.out.println("대여 도서 번호: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int result = lm.rentBook(num);
		
		switch (result) {
		case 0:
			System.out.println("성공적 대여");
			break;
		case 1:
			System.out.println("나이제한, 대여 불가");
			break;
		case 2:
			System.out.println("성공적 대여, 요리학원 쿠폰 발급 성공, 마이페이지 확인");
			break;
		}
		
	}
}
