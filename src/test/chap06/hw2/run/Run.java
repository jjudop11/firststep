package test.chap06.hw2.run;

import test.chap06.hw2.model.vo.Circle;
import test.chap06.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

		Circle[] c = new Circle[2];
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		
		for(Circle circle : c) {
			System.out.println(circle.draw());
		}
		
		
		Rectangle[] r = new Rectangle[2];
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);

		for(Rectangle rectangle : r) {
			System.out.println(rectangle.draw());
		}
		
		
	}

}
