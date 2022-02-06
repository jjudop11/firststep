package ct;

import java.util.Scanner;

public class Ct220205 {
	
	static int count = 0;
	
	public static void partition(int n) {
        partition(n, n, "");
    }
	
    public static void partition(int n, int max, String prefix) {
    	
        if (n == 0) {
            System.out.println(prefix);
            count++;
            return;
        }
        			//두 값 중 작은값
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, prefix + " " + i);
        }
    }

	
	public static void main(String[] args) {
		
		/*숫자를 나누어 표현하는 방법의 수 구하기
		 * 예를 들어 5를 나누어 표현하면
		 * (5), (4,1), (3,1,1), (2,2,1), (2,1,1,1), (1,1,1,1,1) 와 같이 표현 => 7가지 방법
		 * 입력 값을 표현 할 수 있는 방법의 수를 구하는 프로그램 
		 * ex) 5 => 7 
		 *    10 => 42
		 *    
		 *   자연수의 분할 P(n,k) 이용
		 *   https://coderanch.com/t/670268/java/Integer-Partition-recursion
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
        partition(num);
        System.out.println("개수: "+count);
		
		
	}
}
