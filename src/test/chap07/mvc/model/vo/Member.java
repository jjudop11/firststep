package test.chap07.mvc.model.vo;

public class Member {
	
	private String name;
	private int age;
	private char gender;
	private int couponConunt = 0;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponConunt() {
		return couponConunt;
	}

	public void setCouponConunt(int couponConunt) {
		this.couponConunt = couponConunt;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponConunt=" + couponConunt + "]";
	}
	
	
}
