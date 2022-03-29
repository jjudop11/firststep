package ct;

import java.util.ArrayList;

public class Ct20220329_3 {
	
	/*프로그래머스 Summer/Winter Coding(~2018) 소수 만들기
	 * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
	 * 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 
	 * 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
	 */
	
	public int solution(int[] nums) {
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 배열중 3개 숫자합계 조합 뽑기
		for(int i = 0; i < nums.length-2; i++) {
			for(int j = i+1; j < nums.length-1; j++) {
				for(int k = j+1; k < nums.length; k++) {
					list.add(nums[i] + nums[j]+ nums[k]);
				}
			}
		}
		
		int count = 0;
		int answer = 0;
		for(int a = 0; a < list.size(); a++) {
			
			// 소수 찾기: 소수 -> 1과 자기자신만 나눠지는 수
			for(int b = 2; b <= list.get(a); b++) {
				
				if(list.get(a) %b == 0) {
					count += 1;
				}
				
			}
			// 자기자신만 나눠지는 경우 count = 1
			if(count == 1) {
				answer += 1;
			}
			count = 0;
		}
	
        return answer;
    }
	
}
