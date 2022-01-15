package test.chap11.mvc.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import test.chap11.mvc.controller.BookManager;
import test.chap11.mvc.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		while (true) {

			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("메뉴 번호 선택: ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("메뉴를 다시 선택 하세요");
			}
		}
		
	}

	private void insertBook() {

		System.out.println("도서제목: ");
		String title = sc.nextLine();
		
		System.out.println("도서장르 1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타: ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.println("도서 저자: ");
		String author = sc.nextLine();
		
		bm.insertBook(new Book(title, category, author));
		
		
	}

	private void deleteBook() {
		
		System.out.println("도서 번호: ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bNo);
		
		if(result == 1) {
			System.out.println("성공적 삭제");
		
		} else if(result == 0) {
			System.out.println("삭제할 도서가 존재하지 않음");
		}
		
	}

	private void searchBook() {
		
		System.out.println("도서제목: ");
		String title = sc.nextLine();
		
		Collection<Book> searchList = bm.searchBook(title);
		
		if(!searchList.isEmpty()) {
			
			Iterator<Book> i = searchList.iterator();
			
			while (i.hasNext()) {
				System.out.println(i.next()); // 지넥릭스 사용했기때문에 형변환 확인 필요없음
			}
			
		} else {
			System.out.println("도서 목록 존재하지 않음");
			
		}
		
	}

	private void selectList() {
		
		Collection<Book> booklist = bm.selectList();
		
		if(booklist.isEmpty()) {
			System.out.println("도서 목록 존재하지 않음");
			
		} else {
			
			Iterator<Book> i = booklist.iterator();
			
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
		}
	}
}
