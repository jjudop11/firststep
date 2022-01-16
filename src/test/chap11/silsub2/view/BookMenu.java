package test.chap11.silsub2.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import test.chap11.silsub2.controller.BookManager;
import test.chap11.silsub2.model.vo.Book;



public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void MainnMenu() {
		
		while (true) {
			
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
			case 3:
				
				if(bm.deleteBook(inputBookNo()) == null) {
					System.out.println("삭제할 글 없음");
				} else {
					System.out.println("성공적 삭제");
				}
				
				break;
			case 4:
				String key = bm.searchBook(inputBookTitle());
				if(key == null) {
					System.out.println("조회한 글 없음");
				} else {
					System.out.println(bm.selectBook(key));
				}
				
				break;
			case 5:
				
				Iterator<Entry<String, Book>> i = bm.selecAll().entrySet().iterator();
				
				if(bm.selecAll().isEmpty()) {
					System.out.println("없습니다");
				} else {
					
					while (i.hasNext()) {
						Map.Entry<String, Book> entry = i.next();
						System.out.println(entry.getKey() +" / "+entry.getValue());
						
					}
				}
				
				break;
			case 6:
				System.out.println("종료");
				return;		
			default:
				System.out.println("메뉴 다시 선택");
			}
			
			
		}
		
		
	}


	public Book inputBook() {
		
		System.out.println("도서제목: ");
		String title = sc.nextLine();
		
		System.out.println("도서장르 1: 인문 / 2: 자연과학 / 3: 의료 / 4: 기타 : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.println("도서저자: ");
		String author = sc.nextLine();
		
		
		return new Book(category, title, author);
	}
	

	public String inputBookNo() {
		
		System.out.println("도서번호: ");
		String bNo = sc.nextLine();
		
		return bNo;
	}

	public String inputBookTitle() {
		
		System.out.println("도서제목: ");
		String title = sc.nextLine();
		
		return title;
	}
}
