package ct;

import java.util.ArrayList;
import java.util.Collections;

public class Ct20220331_4 {
	
	/* array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	 */
	
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        return answer;
    }
	 public static void main(String[] args) {
		 
		 int[] arr = {5, 9, 7, 10}; //	5	[5, 10]
		 int d = 5;
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		
		 for(int num : arr) {
			 if(num %d == 0) {
				 list.add(num);
				 System.out.println(num);
			 }
		 }
		 if(list.size() == 0) {
			 list.add(-1);
		 }
		 
		 Collections.sort(list);
		 int[] result = new int[list.size()];
		 for(int i = 0; i < list.size(); i++) {
			 result[i] = list.get(i);
			 System.out.println(result[i]);
		 }

		 
	 }
}
