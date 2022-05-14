package ct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Ct20220514 {
	
	/* 백준 - 와글와글 숭고한
	 *숭고한 알고리즘 캠프가 다가오고 있고 방학이 되어서까지도 각 대학들의 협업은 계속되고 있다. 
	 *그럼에도 불구하고 운영진들과 강사진들이 각자의 일정 때문에 바빠 계획에 차질이 조금씩 생기고 있다. 
	 *숭고한 알고리즘 캠프의 대표인 창호는 효율적인 일처리를 위해 엄정한 평가를 내리기로 하였다.
	 *창호는 숭고한 알고리즘 캠프의 구성원인 
	 *숭실대학교(Soongsil University), 고려대학교(Korea University), 한양대학교(Hanyang University)의 참여도를 수치화하였다. 
	 *창호가 보기에 세 대학교의 참여도의 합이 100 이상이면 일처리가 잘 되고 있기에 안심할 수 있지만, 
	 *100 미만이면 창호는 참여도가 가장 낮은 대학의 동아리에게 무언의 압박을 넣을 예정이다. 
	 *숭고한 알고리즘 캠프의 성공을 빌며 창호의 고민을 해결해주자.
	 */
	
	private	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		String[] score = br.readLine().split(" ");
		
		int sum = Arrays.stream(score).mapToInt(Integer::parseInt).sum();
		
		if(sum >= 100) {
			System.out.println("OK");
		} else {
			int val = Arrays.stream(score).mapToInt(Integer::parseInt).sorted().findFirst().getAsInt();
			
			for(int i = 0; i < score.length; i++) {
				
				if(Integer.parseInt(score[i]) == val) {
					
					switch (i) {
					case 0:
						System.out.println("Soongsil");
						break;
					case 1:
						System.out.println("Korea");
						break;		
					case 2:
						System.out.println("Hanyang");
						break;
					}
				}
			}
			
		}
	}

}
