package ct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ct20220507_2 {
	
	/* 백준 - 초6 수학
	 * 두 정수 a와 b 최소공배수는 두 수의 공통된 배수 중 가장 작은 수이고, 최대공약수는 두 수의 공통된 약수중 가장 큰 수이다.
	 * a와 b가 주어졌을 때, 최소공배수와 최대공약수를 구하는 프로그램을 작성하시오.
	 */
	
	private	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        int test = sc.nextInt();
        int[][] count = new int[test][2];
        
        for(int i = 0; i < test; i++) {
        	for(int j = 0; j < 2; j++) {
        		count[i][j] = sc.nextInt();
        	}
        }
        
        
 		for(int i = 0; i < test; i++) {
		  // 최소공배수
 			int min = 0;
 			int su = 1;
 			while (true) {
 				if(su % count[i][0] == 0 && su % count[i][1] == 0) {
 					min = su;
 					break;
 				}
 				su++;
 			}
 			System.out.print(su+" ");

		  // 최대공약수
 			List<Integer> one = new ArrayList<Integer>();
 	        List<Integer> two = new ArrayList<Integer>();
 	        List<Integer> result = new ArrayList<Integer>();
 	        
 			for(int j = 1; j <= count[i][0]; j++) {
    			if(count[i][0] % j == 0) {
    				one.add(j);
    			}
    		}
    		for(int k = 1; k <= count[i][1]; k++) {
    			if(count[i][1] % k == 0) {
    				two.add(k);
    			}
    		}
    		for(Integer a: one) {
    			for(Integer b:two) {
    				if(a.equals(b)) {
    					result.add(b);
    				}
    			}
    		}
    		result.stream().mapToInt(a->a).max().ifPresent(System.out::println);
    		one.clear();
    		two.clear();
    		result.clear();
    
 		}
 		
		
	}

}
