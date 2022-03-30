package ct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ct20220330 {
	
	/* 월간 코드 챌린지 시즌1 두 개 뽑아서 더하기
	 * 정수 배열 numbers가 주어집니다. 
	 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 
	 * 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int[] numbers) {
        
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(i != j) {
					set.add(numbers[i]+numbers[j]);
				}
			}
		}
		
		// set -> list
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		// list 오름차순 정렬
		Collections.sort(list);
       
        // list -> 배열
        return list.stream().mapToInt(i->i).toArray();
    }

}
