package ct;

import java.util.Scanner;

public class Ct220120 {
	
	public static void main(String[] args) {
		/* 프로그래머스 월간 코드 챌린지 시즌2 음양 더하기
		 * 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 
		 * 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
		 * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
		 * 
		 * 입출력 예
			absolutes		   signs				result
			[4,7,12]	  [true,false,true]			  9
			[1,2,3]		  [false,false,true]	      0
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력(,로 구분하여 입력): ");
		String num = sc.nextLine();
		String[] num2 = num.split(",");
		
		int[] absolutes = new int[num2.length];
		for(int i = 0; i < num2.length; i++) {
			absolutes[i] = Math.abs(Integer.valueOf(num2[i]));
		}
		
		System.out.println("정수부호입력(,로 구분하여 true 또는 false): ");
		String sign = sc.nextLine();
		String[] sign2 = sign.split(",");
		
		boolean[] signs = new boolean[absolutes.length];
		for(int i = 0; i < signs.length; i++) {
			signs[i] = Boolean.valueOf(sign2[i]);
		}
		
		System.out.println(solution(absolutes, signs));
	}
	
	 public static int solution(int[] absolutes, boolean[] signs) {
		 
		 int answer = 0;
		 
		 for(int i = 0; i < absolutes.length; i++) {
			 
			 if(signs[i]) { // 삼항 연산자를 쓰면 더 간단해진다 기억하자!, answer += absolutes[i] * (signs[i]? 1:-1);
				 
				 answer += absolutes[i] * 1; 
				 
			 } else {
				 
				 answer += absolutes[i] * -1; 
			 }
			 
		 }
        return answer; 
    }
	
}
