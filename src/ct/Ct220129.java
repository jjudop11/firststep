package ct;

import java.util.Scanner;

public class Ct220129 {
	
	public static void main(String[] args) {
		
		/*어떤 정수n이 주어졌을때 n부터 시작해서 n이 짝수면 2로 나누고 홀수면 3을 곱한다음 1을 더하는 연산 수행
		 * 연산을 거쳐 1이 될때까지 같은 작업을 계속 반복
		 * n이 22일때
		 * 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
		 *다음과 같이 연산, 총 사이클의 길이는 16
		 *수의 범위가 입력 되었을때 범위 내의 수들이 위의 연산을 수행, 가지는 사이클의 길이 중 최대인 길이를 구하는 프로그램 작성
		 *예시) 10 30 -> 112
		 * 		100 200 -> 125
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		String num = sc.nextLine();
		String[] str= num.split(" ");
		int[] numArr = new int[str.length];
		for(int a = 0; a < numArr.length; a++) {
			numArr[a] = Integer.parseInt(str[a]); 
		}
		
		int count = 0; // 사이클횟수
		int result = 0; // 최대사이클횟수확인
		
		for(int i = numArr[0]; i <= numArr[1]; i++) {
			
			int n = i;
			while (n!=1) { // 1되면 반복종료
				count++;
				n = (n %2 == 0? n/2 : n*3+1); 
				
			}
			
			if(result < count++) { // 마지막수(1)일때 최대사이클횟수 비교
				result = count;
			}
			
			count = 0; // 사이클횟수 초기화
		}
		System.out.println("최대사이클길이: "+result);
	}
}
