package test.chap07.practice3.model.vo;

public class Cat extends Animal { // 추상클래스의 메소드를 모두 상속받으면 abstract 없앰
	
	private String location;
	private String color;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
		
		System.out.println(super.toString() + location + "에 서식하며, 색상은"+color+ "입니다");
		
	}
	
	
}
