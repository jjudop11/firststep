package test.chap11.silsub2.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import test.chap11.silsub2.model.dao.BookDao;
import test.chap11.silsub2.model.vo.Book;



public class BookManager {
	
	private Scanner sc = new Scanner(System.in);
	private BookDao bd = new BookDao();


	public void addBook(Book inputBook) {
		
		inputBook.setbNo(String.valueOf(bd.getLastBookNo()));
		bd.addBook(inputBook);
	}

	public Book deleteBook(String key) {
		
		return bd.deleteBook(key);
		
		
	}

	public String searchBook(String title) {
		
		
		return bd.searchBook(title);
	}

	public Book selectBook(String key) {
		
		
		return bd.selectBook(key);
	}

	public HashMap<String, Book> selecAll() {
		
		return bd.selectAll();
	}	
	
	public Book[] sortedBookList() {
		
		Collection<Book> c = bd.sortedBookList();
	
		Book[] b = new Book[c.size()];
		
		int i = 0; 
		for(Book book: c) {
			b[i] = book;
			i++;
		}
		
		return b;
		
	}
	
	
	public void printBookList(Book[] br) {
		
		for(Book b : br) {
			System.out.println(b);
		}
	}

}
