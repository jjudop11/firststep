package test.chap06.hw2.model.vo;

import java.text.DecimalFormat;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}




	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String draw() {
		
		DecimalFormat f1 = new DecimalFormat("00.0");
		return super.draw() + "\n면적: "+f1.format(Math.PI * radius * radius)+"\n둘레: "+f1.format(Math.PI * radius * 2);
	}
	
	
}
