package test.chap05.hw1.run;

import java.math.BigDecimal;

import test.chap05.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee[] arr = new Employee[3];
		arr[0] = new Employee();
		arr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333","서울 잠실");
		arr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222","서울 마곡");
		
		for(Employee e : arr) {
			System.out.println(e.information());
		}
		System.out.println();
		
		arr[0].setEmpNo(0);
		arr[0].setEmpName("김영숙");
		arr[0].setDept("영업부");
		arr[0].setJob("팀장");
		arr[0].setAge(30);
		arr[0].setGender('M');
		arr[0].setSalary(3000000);
		arr[0].setBonusPoint(0.2);
		arr[0].setPhone("01055559999");
		arr[0].setAddress("전라도 광주");
		
		arr[1].setDept("기획부");
		arr[1].setJob("부장");
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
		
		for(Employee e : arr) {
			System.out.println(e.information());
		}
		System.out.println();
		
		double sum = 0;
		
		for (Employee e : arr) {
			double salary = ((double)e.getSalary() + ((double)e.getSalary() * e.getBonusPoint())) * 12;
			BigDecimal salary2 = new BigDecimal(salary);
			System.out.println(e.getEmpName()+"의 연봉 : "+salary2+"원"); 
			// 0의 자리 E단위로 표기말고 그대로 출력되는 방법은? new BigDecimal
			sum += salary;
			
		}
		
		double avg = sum / arr.length;
		BigDecimal avg2 = new BigDecimal(avg);
		
		System.out.println("직원평균연봉: "+avg2+"원");
	}

}
