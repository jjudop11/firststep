package test.chap07.mvc.controller;

import test.chap07.mvc.model.vo.AniBook;
import test.chap07.mvc.model.vo.Book;
import test.chap07.mvc.model.vo.CookBook;
import test.chap07.mvc.model.vo.Member;

public class LibraryManager {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}

	public LibraryManager() {
		// TODO Auto-generated constructor stub
	}

	public void insertMember(Member m) {
		
		mem = m;
		
	}

	public Member myInfo() {

		return mem;
		
	}

	public Book[] selctAll() {
		
		return bList;
	}

	public Book[] searchBook(String keyword) {

		Book[] searchBooks = new Book[5];
		int count = 0;
		
		for(Book b : bList) {
			
			if(b.getTitle().contains(keyword)) {
				searchBooks[count++] = b;
			}
			
		}
		return searchBooks;
	}

	public int rentBook(int num) {
		
		int result = 0;
		
		if(bList[num] instanceof AniBook) {
				
			if(mem.getAge() < ((AniBook)bList[num]).getAccessAge()) {
				result  = 1; // 대여불가
			} 
				
		}
			
		if(bList[num] instanceof CookBook) {
			
			if(((CookBook)bList[num]).isCoupon() == true) {
				mem.setCouponConunt(mem.getCouponConunt()+1);
				result = 2; // 대여 + 쿠폰획득
			} 
			
		}

		return result; // 위 사항들이 해당이 안되면 그냥 일반 대여 0 기본값 반환
		
	}

}
