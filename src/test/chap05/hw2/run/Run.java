package test.chap05.hw2.run;

import java.util.Scanner;

import test.chap05.hw2.model.vo.Student;

public class Run {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student[] arr = new Student[10];
	
		int count = 0; 
		while (true) {
			
			if(count < arr.length) {
			
				System.out.println("학년: ");
				int grade = sc.nextInt();
				System.out.println("반: ");
				int ban = sc.nextInt();
				sc.nextLine();
				System.out.println("이름: ");
				String name = sc.nextLine();
				System.out.println("국어점수: ");
				int kor = sc.nextInt();
				System.out.println("영어점수: ");
				int eng = sc.nextInt();
				System.out.println("수학점수: ");
				int math = sc.nextInt();
				sc.nextLine();
				
				arr[count++] = new Student(grade, ban, name, kor, eng, math);
				System.out.println("계속 추가? y/n: ");
				char ch = sc.nextLine().toLowerCase().charAt(0);
				
				if(ch == 'y') {
					
				} else {
					break;
				}
			}
			System.out.println("더 이상 추가 불가");
			break;
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i].information());
			int sum = arr[i].getEng() + arr[i].getKor() + arr[i].getMath();
			int avg = sum / count;
			System.out.println("평균: "+avg);
		}
		

	}

}
