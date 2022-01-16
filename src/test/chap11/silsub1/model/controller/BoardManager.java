package test.chap11.silsub1.model.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import test.chap11.silsub1.model.dao.BoardDao;
import test.chap11.silsub1.model.dao.comparator.AscBoardDate;
import test.chap11.silsub1.model.dao.comparator.AscBoardNo;
import test.chap11.silsub1.model.dao.comparator.AscBoardTitle;
import test.chap11.silsub1.model.dao.comparator.DescBoardDate;
import test.chap11.silsub1.model.dao.comparator.DescBoardNo;
import test.chap11.silsub1.model.dao.comparator.DescBoardTitle;
import test.chap11.silsub1.model.vo.Board;



public class BoardManager {
	
	private Scanner sc = new Scanner(System.in);
	private BoardDao bd = new BoardDao();
	
	public BoardManager() {
		// TODO Auto-generated constructor stub
	}

	public void writeBoard() {
		
		System.out.println("새 게시글 쓰기");
		System.out.println("글 제목: ");
		String title = sc.nextLine();
		
		System.out.println("작성자: "); // 공백제거
		String writer = sc.nextLine();
		
		String writer2 = "";
		for(int i = 0; i < writer.length(); i++) {
			char ch = writer.charAt(i);
			if(ch != ' ') {
				writer2 += ch;
			}
		}
		
		Date today = new Date();
		
		System.out.println("글 내용(exit 입력시 종료):");
		StringBuilder sb = new StringBuilder();
		
		
		while (true) {
			
			String insert = sc.nextLine(); // 반복해서 입력받아야하기때문
			if(insert.equals("exit")) {
				break;
				
			} else {
				
				sb.append(insert);
				sb.append("\n");
			}
			
		}
		
		int bno = 0;
		Board b = null;
		try {
			
			bno = bd.getLastBoardDao();

		} catch (IndexOutOfBoundsException e) {
			
			bno = 1;
			
		} finally {
			
			b = new Board(bno, title, writer2, today, sb.toString());
			bd.writeBoard(b);
			
		}
		
		
	}

	public void displayAllList() {
		
		Iterator<Board> i = bd.displatAllList().iterator();
		
		if(bd.displatAllList().isEmpty()) {
			System.out.println("저장된 게시글 없음");
		} else {
			
			while (i.hasNext()) {
				System.out.println(i.next());
				
			}
			
		}

	}

	public void displayBoard() {
		
		System.out.println("조회할 글 번호: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(num);
		
		if(b == null) {
			System.out.println("조회된 글이 없습니다");
			
		} else {
			bd.upReadCount(num);
			System.out.println(b.toString());
			
		}

	}

	public void modifyTitle() {
		
		System.out.println("수정 글 번호: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(num);
		
		if(b == null) {
			System.out.println("조회된 글이 없습니다");
			
		} else {
			System.out.println("변경할 글 제목: ");
			String title = sc.nextLine();
			
			bd.modifyTitle(num, title);
			System.out.println("수정 완료");
		}
		
	}

	public void modifyContent() {
		
		System.out.println("수정 글 번호: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(num);
		
		if(b == null) {
			System.out.println("조회된 글이 없습니다");
			
		} else {
			
			System.out.println("변경할 글 내용(exit 입력시 종료): ");
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				
				String insert = sc.nextLine();
				if(insert.equals("exit")) {
					break;
					
				} else {
					
					sb.append(insert);
					sb.append("\n");
				}
				
			}
			
			bd.modifyContent(num, sb.toString());
			System.out.println("수정 완료");
		}

	}

	public void deleteBoard() {
		
		System.out.println("삭제 글 번호: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(num);
		
		if(b == null) {
			System.out.println("조회된 글이 없습니다");
			
		} else {
			System.out.println("정말 삭제? y/n: ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				bd.deleteBoard(num);
				System.out.println("삭제 완료");
			} else {
				System.out.println("삭제 취소");
			}
			
			
			
		}
		
	}

	public void searchBoard() {
		
		System.out.println("검색할 글 제목:  ");
		String title = sc.nextLine();
		
		if(bd.searchBoaard(title).isEmpty()) {
			System.out.println("검색 결과 업음");
		} else {
			
			Iterator<Board> i = bd.searchBoaard(title).iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
		}
		
	}

	public void saveListFile() {
		
		bd.saveListFile();
		
	}

	public void sortList(int num, boolean isDesc) {
		
		ArrayList<Board> l = bd.displatAllList();
		
		if(num == 1) {
			
			if(!isDesc) {
				Collections.sort(l, new AscBoardNo());
			} else {
				Collections.sort(l, new DescBoardNo());
			}
			
		} else if(num == 2) {
			
			if(!isDesc) {
				Collections.sort(l, new AscBoardDate());
			} else {
				Collections.sort(l, new DescBoardDate());
			}
			
		} else if(num == 3) {
			
			if(!isDesc) {
				Collections.sort(l, new AscBoardTitle());
			} else {
				Collections.sort(l, new DescBoardTitle());
			}
			
		}
		
		for(Board b : l) {
			System.out.println(b);
		}
		
		
	}
}
