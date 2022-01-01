package test.chap03;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.jdi.Method;

public class ArrayPractice {
	
	private Scanner sc= new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
	}
	      
	public void practice2() {
		
		int[] arr = new int[10];
		
		int count = 10;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = count--;
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void practice3() {
		
		System.out.println("양의 정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		
		System.out.println(arr[1].toString());
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		
		System.out.println("문자열: : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		System.out.println("문자: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = str.charAt(i);
			
			if(arr[i] == ch) {
				count++;
				if(count == 1) {
					System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스): ");
				}
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println(ch+" 개수: "+count);
	}
	
	public void practice6() {
		
		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };
		
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(0 <= num && num < arr.length) {
			
			for(int i = 0; i < arr.length; i++) {
				
				if(i == num) {
					System.out.println(arr[i].toString()+"요일");
				}
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
	
	public void practice7() {
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총합: "+sum);
	}
	
	public void practice8() {
		
		while (true) {
			
			System.out.println("정수 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num < 3 || num %2 == 0) {
				System.out.println("다시 입력하세요");
			
			} else {
				
				int[] arr = new int[num];
				int count = 0;
				
				for(int i = 0; i < arr.length; i++) {
					
					if(i < arr.length/2+1) {
						arr[i] = ++count;
						System.out.print(arr[i]+" ");
					} else {
						arr[i] = --count;
						System.out.print(arr[i]+" ");
					}
				}
				return;
			}
		}
		
	}
	
	public void practice9() {
		
		String[] arr = {"불닭","후라이드","양념","갈릭","소이"};
		
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(str)) {
				System.out.println(arr[i]+" 배달 가능");
				return;
			} 
		}
		System.out.println(str+"은 없는 메뉴 입니다");
	}
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j = 1; j < i; j++) {
				
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice13() {
		
		System.out.println("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i < 8) {
				arr[i]= str.charAt(i);
				System.out.print(arr[i]);
				
			} else {
				System.out.print("*");
				
			}
			
		}
		
	}
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random()*45+1);
			
			for(int j = 1; j < i; j++) {
				
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
				
			}
		}
		int tmp;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; 
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {

		ArrayPractice a = new ArrayPractice();
		a.practice14();
		

	}

}
