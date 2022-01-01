package test.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	private Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();

		if(num >= 1) {
			
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}
			    
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	
	}
	
	public void practice2() {
		
		while (true) {
			
			System.out.println("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine();

			if(num >= 1) {
				
				for(int i = 1; i <= num; i++) {
					System.out.print(i+" ");
				}
				
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}
	
	public void practice3() {
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();

		if(num >= 1) {
			
			for(int i = num; i <= 1; i--) {
				System.out.print(i+" ");
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
	
	public void practice4() {
		
		while (true) {
			
			System.out.println("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine();

			if(num >= 1) {
				
				for(int i = num; i <= 1; i--) {
					System.out.print(i+" ");
				}
				
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}

	}
	
	public void practice5() {
		
		System.out.println("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			
			if(i < num) {
				System.out.print(i + " + ");
			} else if (i == num){
				System.out.print(i + " = " + sum);
			}
			
		}
		
	}

	public void practice6() {
		
		System.out.println("첫 번째 숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("두 번째 숫자: ");
		int num2= sc.nextInt();
		sc.nextLine();
		
		int tmp = 0;
		
		if(num > 0 && num2 > 0) {
			
			if(num > num2) {
				tmp = num;
				num = num2;
				num2 =tmp;
			} 
			
			for(int i = num; i <= num2; i++) {
				System.out.print(i+" ");
			}
				
			
		} else {
			System.out.println("1이상의 숫자만을 입력해주세요");
		}
	
		
	}
	
	public void practice7() {
		
		while (true) {
			
			System.out.println("첫 번째 숫자: ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println("두 번째 숫자: ");
			int num2= sc.nextInt();
			sc.nextLine();
			
			int tmp = 0;
			
			if(num > 0 && num2 > 0) {
				
				if(num > num2) {
					tmp = num;
					num = num2;
					num2 =tmp;
				} 
				
				for(int i = num; i <= num2; i++) {
					System.out.print(i+" ");
				}
				
			} else {
				System.out.println("1이상의 숫자만을 입력해주세요");
			}
			
		}

	}
	
	public void practice8() {
		
		System.out.println("숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("===== "+num+" =====");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num+" * "+i+" = "+ num*i );
			
		}
		
		
	}

	public void practice9() {
		
		System.out.println("숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(2 <= num && num <= 9) {
			
			for(int i = num; i <= 9; i++) {
				System.out.println("===== "+i+" =====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i+" * "+j+" = "+ i*j );
				}
			}
			
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요");
		}
		
	}
	
	public void practice10() {
		
		while (true) {
			
			System.out.println("숫자: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(2 <= num && num <= 9) {
				
				for(int i = num; i <= 9; i++) {
					System.out.println("===== "+i+" =====");
					for(int j = 1; j <= 9; j++) {
						System.out.println(i+" * "+j+" = "+ i*j );
					}
				}
				
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요");
			}
			
		}
	
	}
	
	public void practice11() {
		
		System.out.println("시작 숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("공차: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int sum = 0;
		
		int i = 1;
		while (i <= 10) {
			
			if(i == 1) {
				System.out.print(num+" ");
				sum = num;
				
			} else {
				sum += num2;
				System.out.print(sum+" ");
				
			}
			i++;
		}
		
	}
	
	public void practice12() {
		
		while (true) {
			
			System.out.println("연산자(+,-,*,/,%): ");
			String str = sc.nextLine();
	
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return;
			} 
			
			System.out.println("정수1: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.println("정수2: ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			
			char ch = str.charAt(0);
			if(ch == '+') {
				System.out.printf("%d + %d = %d", num, num2, num+num2);
				System.out.println();
			} else if (ch == '-') {
				System.out.printf("%d - %d = %d", num, num2, num-num2);
				System.out.println();	
			} else if(ch == '*') {
				System.out.printf("%d * %d = %d", num, num2, num*num2);
				System.out.println();
			} else if(ch == '/') {
					
				if(num2 == 0) {
					System.out.println("0으로 나눌수 없습니다 다시 입력해주세요");
				} else {
					System.out.printf("%d / %d = %d", num, num2, num/num2);	
					System.out.println();
				}	
			
			} else if(ch == '%') {
				System.out.printf("%d % %d = %d", num, num2, num%num2);	
				System.out.println();
					
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
				
			}	
				
		}
		
	}
	//=================================================================하드
	public void practice15() {
		
		System.out.println("숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int count = 0;
		
		if(num >= 2) {
			
			for(int i = 1; i <= num; i++) {
				
				if(num %i == 0) {
					count++;
				}
			}
			
			if(count == 2) { // 1과 자기자신만 나눴을때 나머지0 이여야 함
				System.out.println("소수입니다");
			} else {
				System.out.println("소수가 아닙니다.");
			}
			
			
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	
	}
	
	public void practice16() {
		
		while (true) {
			
			System.out.println("숫자: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			int count = 0;
			
			if(num >= 2) {
				
				for(int i = 1; i <= num; i++) {
					
					if(num %i == 0) {
						count++;
					}
				}
				
				if(count == 2) {
					System.out.println("소수입니다");
					
				} else {
					System.out.println("소수가 아닙니다.");
				}
				return;
				
			} else {
				System.out.println("잘못 입력하셨습니다");
				
			}
		}
		
	}
	
	public void practice17() { 

		System.out.println("숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int count = 0;
		int sum = 0;
		
		if(num >= 2) {
			
			for(int i = 2; i <= num; i++) {
				
				for(int j = 1; j <= i; j++) {
					
					if(i %j == 0) {
						count++;
					}
				}
				
				if(count == 2) {
					System.out.print(i+" ");
					sum++; // 소수인거 모으기
				} 
				count = 0; // 카운트가 몇이였던 상관없이 초기화해줘야함
			}
			System.out.println();
			System.out.println("2부터 "+num+"까지 소수의 개수는 "+sum+"개입니다.");
			
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}
	
	public void practice18() { 
		
		System.out.println("자연수 하나를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int count = 0;
		
		for(int i = 2; i <= num; i++) {
			
			if(i %2 == 0 || i %3 == 0) {
				System.out.print(i+" ");
			}
			
			if(i %2 == 0 && i %3 ==0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count: "+count);
		
	}
	
	public void practice19() {
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = i; j <= num-1; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	public void practice20() {
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		for(int i = 1; i <= num-1; i++) {	
			
			for(int k = i; k <= num-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	public void practice21() {
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = i; j <= num-1; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}
	
	public void practice22() {
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			
			if(i == 1 || i== num) {
				
				for(int j = 1; j <= num; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			} else {
				
				for(int k = 1; k <= num; k++) {
					
					if(k == 1 || k ==num) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
	// =============================가이드대로 정리 하면
		
		System.out.println("정수 입력: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num2; i++) {
			
			for(int j = 1; j <= num2; j++) {
				
				if(i == 1 || i== num2) {
				System.out.print("@");
				
				} else {
					
					if(j == 1 || j ==num2) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
			
				}
			
			}
			System.out.println();
			
		}
	
	}
	
	// ===================================hard별찍기 
	public void practice23() {
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
//		for(int i = 1; i <= 4; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			// == 밑부분은 못풀었다 9-i*2 조건을 어떻게 생각하는 거지??
//			for(int k = 1; k <= 9-i*2; k++) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 4 ; i++) {
			
			int count = 1;
			
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
				
			}
			for(int j = 7; j >= i*2-1; j--) {
				System.out.print(count++);
			}
			System.out.println();
		}
		
		
	}
	
	public void practice24() { // 다시봐도 이해안감... 가이드의 코드도 이해안감
		
		for (int i = 1 ; i <= 3; i++) {  
			
			for (int j = 1; j <= 3-i; j++) { 
				System.out.print(" ");
			}
			for (int k = 1; k <= i*2-1; k++) { 
				
				if (k == 1 || k == i*2-1) { // 1,3,5
					System.out.print("*");
				} else { 
					System.out.print(" ");
				}
			} 
		System.out.println(); 
		}
			 
		for (int i = 1 ; i <= 2; i++) {  
			
			for (int j = 1; j <= i; j++) { 
				System.out.print(" ");
			}
			for (int k = 1; k <= 5-i*2; k++) { 
				
				if (k == 1 || k == i*2+1) { // 1,3
					System.out.print("*");
				} else { 
					System.out.print(" ");
				}	
			}	
		System.out.println(); 
		}
		
	}
	
	public void practice25() {
		
		for(int i = 1; i <= 5; i++) {
			
			if(i == 1 || i == 5) {
				
				for(int j = 1; j <= 10; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			else {
				
				for(int k = 1; k <= 10; k++) {
					
					if(k == 1 || k == 10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}	
				System.out.println();
			}

		}
		
		// 가이드는 위코드를 정리되어있는 것임
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 10; j++) {
				
				if(i == 1 || i == 5) {
					System.out.print("8");
					
				}else {
					
					if(j == 1 || j == 10) {
						System.out.print("8");
					} else {
						System.out.print(" ");
					}
					
				}
				
			}
			System.out.println();
		}	

	}
	

	
	public static void main(String[] args) {
	
		LoopPractice l = new LoopPractice();
		l.practice25();
	}

}
