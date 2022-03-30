package ct;

public class Ct20220329 {
	
	/*프로그래머스 월간 코드 챌린지 시즌3 없는 숫자 더하기
	 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다
	 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 retuen하도록 완성해주세요
	 */
	
	public int solution(int[] numbers) {
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < numbers.length; j++) {
				
				if(numbers[j] == arr[i]) {
					arr[i] = 0;
				}
			}			
				
		}
		
		for(int a: arr) {
			result += a;
		}
		
		
        return result;
    }

}
