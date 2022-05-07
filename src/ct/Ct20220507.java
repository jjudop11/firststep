package ct;

import java.util.Arrays;
import java.util.Scanner;

public class Ct20220507 {
	
	/* 백준 - 숫자의 개수
	 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
	 * 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
	 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
	 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
	 */
	
	private	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] count = new int[10];
        
        String result = String.valueOf(a * b * c);
        
        for(int i = 0; i < result.length(); i++) {
        	
        	switch (result.charAt(i)) {
			case '0': count[0]++; break;
			case '1': count[1]++; break;
			case '2': count[2]++; break;
			case '3': count[3]++; break;
			case '4': count[4]++; break;
			case '5': count[5]++; break;
			case '6': count[6]++; break;
			case '7': count[7]++; break;
			case '8': count[8]++; break;
			case '9': count[9]++; break;
			}
        }
        
        Arrays.stream(count).forEach(System.out::println);
        
	}

}
