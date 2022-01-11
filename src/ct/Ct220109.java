package ct;

import java.util.Scanner;
import java.util.Stack;

public class Ct220109 {
	
	private Scanner sc = new Scanner(System.in);
	
	public void ct220109_1() {
		
		// 프로그래머스 2021 카카오 채용연계형 인턴십 숫자 문자열과 영단어

		//네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다
		//다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
		//1478 → "one4seveneight"
		//234567 → "23four5six7"
		//10203 → "1zerotwozero3"
		//이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. 
		//s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
		
		// String함수 중 replace 이용
		
		System.out.println("문장입력: ");
		String s = sc.nextLine();
		
//		s = s.replace("zero", "0");
//      s = s.replace("one", "1");
//      s = s.replace("two", "2");
//      s = s.replace("three", "3");
//      s = s.replace("four", "4");
//      s = s.replace("five", "5");
//      s = s.replace("six", "6");
//      s = s.replace("seven", "7");
//      s = s.replace("eight", "8");
//      s = s.replace("nine", "9"); 
		
// 		for문으로 반복해 보자
		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < arr.length; i++) {
			s = s.replace(arr[i], i+""); // i자체는 int타입임 -> String형태인 i로 바꿔줌, String.valueOf() , Integer.toString() , 숫자+" "
		}

		int result = Integer.parseInt(s); // 래퍼클래스
		System.out.println(result);
		
	}
	
	public void ct220109_2() {
		
		System.out.println("문장입력: ");
		String s = sc.nextLine();
		String num = "0123456789";
		String result = "";
		
		if(0 <= s.length() && s.length() <= 50) { 

			
			for(int i = 0; i < s.length(); i++) {
                
				for(int j = 0; j < num.length(); j++) { // 숫자문자열일때
					
					if(s.charAt(i) == num.charAt(j)) {
						result += num.charAt(j);
				}

				} if(s.charAt(i) == 'z') {
					i += 3;
					result += "0";
					
				} else if(s.charAt(i) == 'o') {
					i += 2;
					result += "1";
					
				} else if (s.charAt(i) == 't' && s.charAt(i+1) == 'w') {
					i += 2;
					result += "2";
					
				} else if (s.charAt(i) == 't') {
					i += 4;
					result += "3";
					
				} else if (s.charAt(i) == 'f' && s.charAt(i+1) == 'o') {
					i += 3;
					result += "4";
					
				} else if (s.charAt(i) == 'f') {
					i += 3;
					result += "5";
					
				} else if (s.charAt(i) == 's' && s.charAt(i+1) == 'i') {
					i += 2;
					result += "6";
					
				} else if (s.charAt(i) == 's') {
					i += 4;
					result += "7";
					
				} else if (s.charAt(i) == 'e') {
					i += 4;
					result += "8";
					
				} else if (s.charAt(i) == 'e') {
					i += 3;
					result += "9";
				}
				
			}
			
			int result2 = Integer.parseInt(result);
			System.out.println(result2);
		
		}
			
	}
	

	public static void main(String[] args) {
		
		Ct220109 ct = new Ct220109();
		ct.ct220109_1();

	}
}
