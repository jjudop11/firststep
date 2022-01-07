package test.chap06.hw1.run;

import java.util.Scanner;

import test.chap06.hw1.model.vo.Employee;
import test.chap06.hw1.model.vo.Student;


public class Run {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		s[0] = new Student("홍길동", 20 ,178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		
		for(Student student : s) {
			System.out.println(student.information());
		}
		
		
		Employee[] e = new Employee[10];
		int count = 0;
		
		while (true) {
			
			System.out.println("이름입력: ");
			String name = sc.nextLine();
			System.out.println("나이입력: ");
			int age = sc.nextInt();
			System.out.println("신장입력: ");
			double h = sc.nextDouble();
			System.out.println("몸무게입력: ");
			double w = sc.nextDouble();
			System.out.println("급여입력: ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println("부서입력: ");
			String dept = sc.nextLine();
			
			e[count++] = new Employee(name, age, h, w, salary, dept);
			
			System.out.println("계속 추가? y/n: ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch != 'Y') {
				break;
			}
		
			
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(e[i].information());
		}
		
	}

}
