package test.chap11.silsub2.model.vo;

public class Book implements Comparable<Book> {
	
	private String bNo;
	private int category;
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(int category, String title, String author) {
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		switch (category) {
		case 1:
			str = "인문";
			break;
		case 2:
			str = "자연과학";
			break;
		case 3:
			str = "의료";
			break;
		case 4:
			str = "기타";
			break;
		}
		
		
		return "Book [bNo=" + bNo + ", category=" + str + ", title=" + title + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Book b) {
								//	<Book> 제너릭스 사용안하면 형변환 필수
		return this.title.compareTo(b.title);

	}

}
