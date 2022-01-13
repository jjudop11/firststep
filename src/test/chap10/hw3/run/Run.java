package test.chap10.hw3.run;

import test.chap10.hw3.controller.BookManager;

public class Run {

	public static void main(String[] args) {
		
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();


	}

}
