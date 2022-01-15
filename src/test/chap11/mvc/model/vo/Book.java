package test.chap11.mvc.model.vo;

public class Book {
	
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	public Book() {}
	
	public Book(String title, int category, String author) {
		this.title = title;
		this.category = category;
		this.author = author;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		
		String str = "";
		
		if(category == 1) {
			str = "인문";
		} else if(category == 2) {
			str = "자연과학";
		} else if(category == 3) {
			str = "의료";
		} else if(category == 4) {
			str = "기타";
		}
		
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + str + ", author=" + author + "]";
	}
	
}
