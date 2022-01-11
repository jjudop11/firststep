package ct;

import java.util.Scanner;

public class Ct220102 {
	
	private	Scanner sc = new Scanner(System.in);
	
	public void bj2748() {
		// 백준 2748 문제
		// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
		// 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
		// n=17일때 까지 피보나치 수를 써보면 다음과 같다.
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
		// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
		
		System.out.println("정수 입력: ");
		long num = sc.nextInt();
		sc.nextLine();
		
		long a = 0;
		long b = 1;
		long c;
		
		if(num < 91) {
			
			if(num == 0) {
				System.out.println(0);
			} else if(num == 1) {
				System.out.println(1);
				
			} else {
				
				for(int i = 1; i < num; i++) {
					c = a+b;
					a = b;
					b = c;
					System.out.print(c+" "); 
				}
				
			}
			
		}

		
	}

	
	public static void main(String[] args) {
		
		Ct220102 ct = new Ct220102();
		ct.bj2748();

	}

}
