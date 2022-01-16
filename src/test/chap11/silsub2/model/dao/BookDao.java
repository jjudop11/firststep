package test.chap11.silsub2.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import test.chap11.silsub2.model.vo.Book;



public class BookDao {
	
	private HashMap<String, Book> bookmap = new HashMap<String, Book>();

	public BookDao() {}
	
	public BookDao(HashMap<String, Book> bookMap) {
		this.bookmap = bookMap;
	}
	
	public int getLastBookNo() {
		
		int num = 0;
		
		Iterator<String> i = bookmap.keySet().iterator();
		
		while (i.hasNext()) {
			num = Integer.valueOf(i.next());
			
		}

		return num+1;
	}

	public void addBook(Book b) {
		
		bookmap.put(b.getbNo(), b);
		
	}

	public Book deleteBook(String key) {
		
		
		return bookmap.remove(key);
	}

	public String searchBook(String title) {
		
		String key = null;
		
		Iterator<Entry<String, Book>> i = bookmap.entrySet().iterator();
		
		while (i.hasNext()) {
			
			Book b = i.next().getValue();
			if(b.getTitle().equals(title)) {
				
				key = b.getbNo();
				
			}
			
		}
		return key;
	}

	public Book selectBook(String key) {
		
		
		return bookmap.get(key);
	}

	public HashMap<String, Book> selectAll() {
		// TODO Auto-generated method stub
		return bookmap;
	}
	
	public ArrayList<Book> sortedBookList() {
		
		Iterator<Entry<String, Book>> e = bookmap.entrySet().iterator();
		
		ArrayList<Book> bList = new ArrayList<Book>();
				
		while (e.hasNext()) {
		
			bList.add(e.next().getValue()) ;
	
		}
		
		Collections.sort(bList);	
		
		/*
		Iterator<Book> v = bookmap.values().iterator();
		
		ArrayList<Book> bList2 = new ArrayList<Book>();
		
		while (v.hasNext()) {
			bList2.add((Book) v);
			
		}

		Collections.sort(bList2);
		*/
		
		return bList;
	}
}
