package ct;

import java.util.Scanner;
import java.util.Stack;

public class Ct220111 {
	
//	괄호 짝맞추기
//	대괄호[], 중괄호{}, 소괄호() 가 짝이 맞게 적절히 배치되어있는지를 판별하는 프로그램 작성
//	
//	단, 각 괄호의 우선순위는 상관x
	
	
	public void Ct220111_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("괄호 짝맞추기: ");
		String str = sc.nextLine();
		
		
		String change = "";
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == '[' || str.charAt(i) == ']') {
				change += 1; 
			} else if(str.charAt(i) == '{' || str.charAt(i) == '}') {
				change += 2;
			} else if(str.charAt(i) == '(' || str.charAt(i) == ')') {
				change += 3;
			}
			
		}
		
		Stack<Character> s = new Stack<Character>();
		boolean tf = true;
		
		for(int i = 0; i < change.length(); i++) {
			s.push(change.charAt(i));
		}
		
		if(s.size() %2 != 0 || s.empty() == true) {
			
			tf = false;
			
		} else {
			
			for(int i = 0; i < change.length() /2; i++) {
				
				if(change.charAt(i) == s.pop()) {
					tf = true;
				
				} else {
					tf = false;
					break;
				}

			}
		
		}
		System.out.println("결과"+tf);		
	// 이건 좌우 대칭으로만 괄호 짝 확인가능... [{({[()]})}]
	}
	
	public void Ct220111_2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("괄호 짝맞추기: ");
		String str = sc.nextLine();
		Stack<Character> s = new Stack<Character>();
		
		boolean tf = true;
		
		if(str.length() %2 != 0) {
			
			tf = false;
			
		} else {
		
			for(int i = 0; i < str.length(); i++) {
				
				if(str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{') {
					s.push(str.charAt(i));
				}
				
				if(str.charAt(i) == ']' && s.peek() == '[') {
					s.pop();
					
				} else if(str.charAt(i) == ')' && s.peek() == '(') {
					s.pop();
					
				} else if(str.charAt(i) == '}' && s.peek() == '{') {
					s.pop();
				}
				
			}
			tf = s.empty();
		}
		
		System.out.println("결과"+tf);		
	}
	
	public static void main(String[] args) {
		
		Ct220111 c = new Ct220111();
		c.Ct220111_1();
		
	}
}
