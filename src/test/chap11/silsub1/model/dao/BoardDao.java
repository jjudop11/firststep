package test.chap11.silsub1.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import test.chap11.silsub1.model.vo.Board;

public class BoardDao {
	
	private ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		
		try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
			
			while(true) {
				list.add((Board) oi.readObject());
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
			return;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	public int getLastBoardDao() {
		
		return list.get(list.size()-1).getBoardNo()+1;
	}

	public void writeBoard(Board b) {
		
		list.add(b);
	}

	public ArrayList<Board> displatAllList() {
		// TODO Auto-generated method stub
		return list;
	}

	public Board displayBoard(int num) {

		for(Board b : list) {
			
			if(b.getBoardNo() == num) {
				return b;
				
			}
		}
		
		return null;
	}

	public void upReadCount(int num) {
		
		for(Board b : list) {
			
			if(b.getBoardNo() == num) {
				b.setReadCount(b.getReadCount()+1);
			}
		}
		
	}

	public void modifyTitle(int num, String title) {
		
		for(Board b : list) {
			
			if(b.getBoardNo() == num) {
				b.setBoardTitle(title);
			}
		}
		

		
	}

	public void modifyContent(int num, String insert) {
	
		for(Board b : list) {
			
			if(b.getBoardNo() == num) {
				b.setBoardCoutent(insert);
			}
		}
	}

	public void deleteBoard(int num) {
		
		for(Board b : list) {
			
			if(b.getBoardNo() == num) {
				list.remove(b);
				return;
			}
		}

	}

	public ArrayList<Board> searchBoaard(String title) {
		
		ArrayList<Board> search = new ArrayList<Board>();
		
		for(Board b : list) {
			
			if(b.getBoardTitle().contains(title)) {
				search.add(b);
				b.setReadCount(b.getReadCount()+1);
			}
		}
		return search;
	}

	public void saveListFile() {
		
		try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			
			Iterator<Board> i = list.iterator();
			
			while (i.hasNext()) {
				Board board = i.next();
				oo.writeObject(board);
			}
			
			/*
			oo.writeObject(list);
			*/
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
