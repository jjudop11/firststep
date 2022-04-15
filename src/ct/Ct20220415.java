package ct;

import java.util.Scanner;

public class Ct20220415 {
	
	/* 백준 - 할로윈의 사탕
	 * 할로윈데이에 한신이네는 아부지가 사탕을 나눠주신다. 
	 * 하지만 한신이의 형제들은 서로 사이가 좋지않아 서른이 넘어서도 사탕을 공정하게 나누어 주지 않으면 서로 싸움이 난다. 
	 * 매년 할로윈데이때마다 아부지는 사탕을 자식들에게 최대한 많은 사탕을 나누어 주시기 원하며 
	 * 자신에게는 몇개가 남게되는지에 알고 싶어 하신다. 이런 아부지를 도와서 형제간의 싸움을 막아보자.
	 */
	
	private	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        int count = sc.nextInt();
        int get = 0;
        int remainder = 0;
		for(int i = 0; i < count; i++) {
			
			int candy = sc.nextInt();
			int people = sc.nextInt();
			
			get = candy / people;
			remainder = candy % people;
			System.out.println("You get " + get +" piece(s) and your dad gets "+ remainder +" piece(s).");
			
		}
		
	}

}
