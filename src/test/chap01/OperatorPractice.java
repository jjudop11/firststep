package test.chap01;

import java.util.Scanner;

public class OperatorPractice {
	
	private	Scanner	sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println(num > 0? "양수다":"양수가 아니다");
		
		  
	}
	
	public void practice2() {
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println(num > 0? "양수다":num == 0? "0이다": "음수다");
	}
	
	public void practice3() {
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println(num %2 == 0? "짝수다":"홀수다");
	}
	
	public void practice4() {
		
		System.out.println("인원수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("사탕 개수: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1인당 사탕개수: "+num2/num);
		System.out.println("1인당 사탕개수: "+num2%num);
		
	}
	
	public void practice5() {
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("학년: ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("반: ");
		int ban = sc.nextInt();
		sc.nextLine();
		
		System.out.println("번호: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별M/F: ");
		char gender = sc.nextLine().charAt(0);
		sc.nextLine();
		
		System.out.println("성적: ");
		double test = sc.nextDouble();
	
		System.out.println(grade + "학년 "+ ban + "반 "+ num +"번 "+name + (gender == 'M'? '남':'여') + "학생의 성적은 "+test+"이다");  
		
	}
	
	public void practice6() {
		
		System.out.println("나이: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println(num > 19? "성인":num > 13? "청소년":"어린이");
	}
	
	public void practice7() {
		
		System.out.println("국어: ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.println("영어: ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		System.out.println("수학: ");
		int math = sc.nextInt();
		sc.nextLine();
		
		int sum = kor+eng+math;
		double avg = sum / 3;
		
		System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60? "합격":"불합격");
	}
	
	public void practice8() {
		
		System.out.println("주민번호: ");
		char num = sc.nextLine().charAt(7);
		sc.nextLine();
		
		System.out.println((num == '1'|| num == '3')? "남자":"여자");
	}	
	
	public void practice9() {
		
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("입력: ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println((num3 <= num1 || num3 > num2)? true:false);
		
		
	}	
	
	public void practice10() {
		
		System.out.println("입력1: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("입력2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("입력3: ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println((num1 == num2 && num1 ==num3)? true:false);
		
		
	}	
	
	public void practice11() {
		
		System.out.println("A사원연봉: ");
		double num1 = sc.nextDouble();

		
		System.out.println("B사원연봉: ");
		double num2 = sc.nextDouble();

		
		System.out.println("C사원연봉: ");
		double num3 = sc.nextDouble();

		double in1 = num1 + (num1*0.4);
		double in3 = num3 + (num3*0.15);
		System.out.println(in1);
		System.out.println("A사원의 인센티브 포함 연봉: "+ in1 + (in1 > 3000? " 3000이상":" 3000미만"));
		System.out.println("A사원의 인센티브 포함 연봉: "+ num2 + (num2 > 3000? " 3000이상":" 3000미만"));
		System.out.println("A사원의 인센티브 포함 연봉: "+ in3 + (in3 > 3000? " 3000이상":" 3000미만"));
		
		
	}	
}	
