package ct;

import java.util.Arrays;
import java.util.Scanner;

public class Ct20220423 {
	
	/* 백준 - 자기복제수
	 * 어떤 자연수 N을 제곱했을 때, 그 제곱수의 맨 뒷자리에 원래의 수 N이 다시 나타나면, 우리는 그 수 N을 자기복제수라고 한다.
	 * 예를 들면, 5의 제곱은 52는 25이고 25의 맨 뒷자리에 원래의 수 5가 나타나므로 5는 자기복제수이다. 
	 * 또 다른 예로, 76의 제곱은 5776이고 5776의 맨 뒷자리에 76이 나타나므로 76 또한 자기복제수이다.
	 * 자연수 N이 주어졌을 때, 그 수가 자기복제수인지 아닌지를 알아내는 프로그램을 작성하시오.
	 */
	
	private	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        int test = sc.nextInt();
        
        long[] number = new long[test];
        long result;
        String[] print = new String[test];
        
        for(int i = 0; i < test; i++) {
        	number[i] = sc.nextInt(); 
	
        }
        /* 기존코드
        for (int i = 0; i < number.length; i++) {
        	
			result = (long) Math.pow(number[i], 2);
			
			if(String.valueOf(number[i]).length() == 2) {
				
				if(Integer.parseInt(String.valueOf(result).substring(String.valueOf(result).length()-2, String.valueOf(result).length())) == number[i]) {
					print[i] = "YES";
				} else {
					print[i] = "NO";
				}
			} else if(String.valueOf(number[i]).length() == 3) {
				if(Integer.parseInt(String.valueOf(result).substring(String.valueOf(result).length()-3, String.valueOf(result).length())) == number[i]) {
					print[i] = "YES";
				} else {
					print[i] = "NO";
				}
				
			} else if(String.valueOf(number[i]).length() == 4) {
				if(Integer.parseInt(String.valueOf(result).substring(String.valueOf(result).length()-4, String.valueOf(result).length())) == number[i]) {
					print[i] = "YES";
				} else {
					print[i] = "NO";
				}
				
			} else {
				if(Integer.parseInt(String.valueOf(result).substring(String.valueOf(result).length()-1)) == number[i]) {
					print[i] = "YES";
				} else {
					print[i] = "NO";
				}
			
			}
			
		}
		*/
        
        // 중복코드정리
        int len;
        for (int i = 0; i < number.length; i++) {
        	
			result = (long) Math.pow(number[i], 2); // 제곱수
			len = String.valueOf(number[i]).length();

			if(Integer.parseInt(String.valueOf(result).substring(String.valueOf(result).length()-len)) == number[i]) {
				print[i] = "YES";
			} else {
				print[i] = "NO";
			}
			
		}

        Arrays.asList(print).forEach(System.out::println);

	}

}
