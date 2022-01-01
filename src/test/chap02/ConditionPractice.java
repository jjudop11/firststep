package test.chap02;

import java.util.Scanner;

public class ConditionPractice {
	
	private Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴번호를 입력하세요");
		int num = sc.nextInt();
		sc.nextLine();
		    
		switch (num) {
		case 1:
			System.out.println("입력메뉴입니다");
			break;
		case 2:
			System.out.println("수정메뉴입니다");
			break;
		case 3:
			System.out.println("조회메뉴입니다");
			break;
		case 4:
			System.out.println("삭제메뉴입니다");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다");
			break;
		}
		
	}
	
	public void practice2(){
		 
		System.out.println("숫자를 한 개 입력하세요");
		int num = sc.nextInt();
		sc.nextLine();
		 
		if(num > 0) {
			 
			if(num%2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			 }
			 
		 } else {
			 System.out.println("양수만 입력해주세요");
		 }
		 
	}
	
	public void practice3(){
		 
		System.out.println("국어점수: ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.println("수학점수: ");
		int math = sc.nextInt();
		sc.nextLine();
		System.out.println("영어점수: ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		int sum = kor+math+eng;
		double avg = sum/3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어: "+kor);
			System.out.println("수학: "+math);
			System.out.println("영어: "+eng);
			System.out.println("합계: "+sum);
			System.out.println("평균: "+avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		 
	}
	 
	public void practice4(){
		
		System.out.println("1~12사이의 정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 12: case 1: case 2: 
			System.out.println(num+"월은 겨울입니다");
			break;
		case 3: case 4: case 5: 
			System.out.println(num+"월은 봄입니다");
			break;
		case 6: case 7: case 8: 
			System.out.println(num+"월은 여름입니다");
			break;
		case 9: case 10: case 11: 
			System.out.println(num+"월은 가을입니다");
			break;
		default:
			System.out.println(num+"월은 잘못 입력된 달입니다.");
			break;
		}
		
	}

	public void practice5(){
		
		System.out.println("아이디: ");
		String str = sc.nextLine();
		System.out.println("비밀번호: ");
		String str2 = sc.nextLine();
		
		String id = "user1";
		String pwd = "1234";
		
		if(id.equals(str)) {
			
			if(pwd.equals(str2)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
			
		} else {
			System.out.println("아이디가 틀렸습니다");
		}
		
		
	}

	public void practice6(){
		
		System.out.println("권한을 확인하고자 하는 회원 등급: ");
		String str = sc.nextLine();
		
		if(str.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리");
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
			
		} else if(str.equals("회원")) {
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
			
		} else if(str.equals("비회원:")) {
			System.out.println("게시글 조회");
			
		} else {
			System.out.println("잘못 입력했습니다");
		}
		
		
	}
	
	public void practice7(){
		
		System.out.println("키m를 입력해주세요: ");
		double h = sc.nextDouble();
		System.out.println("몸무게kg를 입력해주세요: ");
		double w = sc.nextDouble();
		
		double bmi = w / (h * h);
		
		System.out.println("BMI 지수: "+bmi);
		if(bmi >= 30) {
			System.out.println("고도비만");
		} else if(bmi >= 25) {
			System.out.println("비만");
		} else if(bmi >= 23) {
			System.out.println("과체중");
		} else if(bmi >= 18.5) {
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}
		
		
	}
	
	public void practice8(){
		
		System.out.println("피연산자1 입력: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("피연산자1 입력: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("피연산자1 입력: ");
		char ch = sc.nextLine().charAt(0);
		
		if(num1 > 0 && num2 > 0) {
			
			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d", num1,num2,num1+num2);
				break;
			case '-':
				System.out.printf("%d - %d = %d", num1,num2,num1-num2);
				break;
			case '*':
				System.out.printf("%d * %d = %d", num1,num2,num1*num2);
				break;
			case '/':
				System.out.printf("%d / %d = %d", num1,num2,num1/num2);
				break;
			case '%':
				System.out.printf("%d % %d = %d", num1,num2,num1%num2);
				break;
			default:
				break;
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
		}
		
	}
	
	 public void practice9(){
		 
		System.out.println("중간 고사 점수: ");
		int j = sc.nextInt();
		sc.nextLine();
		System.out.println("기말 고사 점수: ");
		int k = sc.nextInt();
		sc.nextLine();
		System.out.println("과제 점수: ");
		int test = sc.nextInt();
		sc.nextLine();
		System.out.println("출석 회수: ");
		double c = sc.nextDouble();
		
		double j2 = j * 0.2;
		double k2 = k * 0.3;
		double test2 = test * 0.3;
		
		double sum = j2+k2+test2+c;
		
		if(sum >= 70) {
			
			if(c >= 14) {
			
				System.out.println("중간 고사 점수(20): "+j2);
				System.out.println("기말 고사 점수(30): "+k2);
				System.out.println("과제 점수(30): "+test2);
				System.out.println("출석 점수(20): "+c);
				System.out.println("총점: "+sum);
				System.out.println("PASS");
			
			} else {
				System.out.println("FAIL [출석 횟수 부족] ("+(int)c+"/20)");
			}
			
		} else {
			
			if(c >= 14) {
				System.out.println("FAIL [점수 미달] (총점 "+sum+")");
			} else {
				System.out.println("FAIL [출석 횟수 부족] ("+(int)c+"/20)");
				System.out.println("FAIL [점수 미달] (총점 "+sum+")");
			}
			
		}
		
	 }
	
	public void practice10(){
		
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;

		}
		
	}
	
	public static void main(String[] args) {
		
		ConditionPractice c = new ConditionPractice();
		c.practice9();

	}

}
