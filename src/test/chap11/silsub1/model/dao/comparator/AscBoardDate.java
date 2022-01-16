package test.chap11.silsub1.model.dao.comparator;

import java.util.Comparator;

import test.chap11.silsub1.model.vo.Board;



public class AscBoardDate implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		
		return o1.getBoardDate().compareTo(o2.getBoardDate());
	}

}
