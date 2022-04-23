package ct;

import java.util.Arrays;
import java.util.Scanner;

public class Ct20220420 {
	
	/* 백준 - 동전게임
	 * 동전게임은 주로 두 사람이 함께 즐기는 게임이다. 
	 * 이 중 3-동전게임은 여러 명이 할 수 있는 게임이다. 각 사람은 각각 3-동전수열 중 하나를 선택한다. 
	 * 3-동전수열이란 앞 뒤 앞과 같은 수열이고, 8가지(뒤뒤뒤,뒤뒤앞,뒤앞뒤,뒤앞앞,앞뒤뒤,앞뒤앞,앞앞뒤,앞앞앞)가 있다.
	 * 이제 심판은 동전 1개를 40번 던진다. 그 다음 심판은 동전이 앞인지 뒤인지를 던진 순서대로 종이에 적는다. 
	 * 그 다음 3-동전수열이 각각 몇 번씩 나왔는지 기록한다. 가장 많이 나온 수열을 선택한 사람이 이긴다.
	 * 동전 40번 던진 결과가 주어졌을 때, 3-동전수열이 각각 몇 번 나왔는지를 출력하는 프로그램을 작성하시오. 
	 * 예를 들어, 40개의 동전이 모두 앞면일 경우 앞앞앞은 38번 나타난다..
	 */
	
	private	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        int test = sc.nextInt();
        
        String[] HT = new String[test];
        String check = null;
        String[] result = new String[test];
        int TTT=0, TTH=0, THT=0, THH=0, HTT=0, HTH=0, HHT=0, HHH = 0;

        for(int i = 0; i < test; i++) {
        	HT[i] = sc.next(); 
        }
        
        for(int i = 0; i < HT.length; i++) {
        	
	        for (int j = 0; j < HT[i].length()-2; j++) {
	        	
	        	check = HT[i].substring(j, j+3);
	        	switch (check) {
				case "TTT": TTT++; break;
				case "TTH": TTH++; break;
				case "THT": THT++; break;
				case "THH": THH++; break;
				case "HTT": HTT++; break;
				case "HTH": HTH++; break;
				case "HHT": HHT++; break;
				default: HHH++; break;
	        	}
	        	
	        }
	        result[i] = TTT+" "+TTH+" "+THT+" "+THH+" "+HTT+" "+HTH+" "+HHT+" "+HHH;
	        TTT=0; TTH=0; THT=0; THH=0; HTT=0; HTH=0; HHT=0; HHH = 0;
        }
        
        Arrays.asList(result).forEach(System.out::println);
	}


}
