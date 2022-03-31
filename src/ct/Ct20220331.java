package ct;

public class Ct20220331 {
	
	/* 프로그래머스 월간 코드 챌린지 시즌2 약수의 개수와 덧셈
	 * 두 정수 left와 right가 매개변수로 주어집니다. .
	 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
	 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	 */
	
	public int solution(int left, int right) {
        
        int count = 0;
	    int sum = 0;
		
		for(int i = left; i <= right; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				count += (i %j == 0? 1: 0); // 약수개수구하기
				
			}
			sum += (count %2 == 0? i : -i); // 약수의 개수 짝수, 홀수 구분하기
			count = 0;
		}
        return sum;
	}

}
