package test.chap11.mvc.controller;

import java.util.ArrayList;

import test.chap11.mvc.model.vo.Book;

public class BookManager {
	
	private ArrayList<Book> bookList = new ArrayList<Book>();

	public void insertBook(Book book) {
		
		int lastNo = 0;
		
		try {
			
			lastNo = bookList.get(bookList.size()-1).getbNo() + 1;
			
		} catch (IndexOutOfBoundsException e) {
			
			lastNo = 1;
			
		} finally {
			
			book.setbNo(lastNo);
			bookList.add(book);
			
		}
		
		
		
	}

	public int deleteBook(int bNo) {

		for(Book b : bookList) {
			
			if(b.getbNo() == bNo) {
				bookList.remove(b);
				return  1; 
				// 삭제하자마자 리턴하면서 종료해야함 
				// ConcurrentModificationException 예외발생 방지
				// 돌리는 도중 remove를 호출하면 기존 index 값과 remove 호출로 인해 줄어든 size 값이 맞지 않기 때문에 예외가 발생
			}
			
		}
		return 0;
	}

	public ArrayList<Book> searchBook(String title) {
		
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(Book b : bookList) {
			
			if(b.getTitle().contains(title)) {
				searchList.add(b);
		
			}
			
		}
		
		return searchList;
	}

	public ArrayList<Book> selectList() {
		
		return bookList;
	} 
}
