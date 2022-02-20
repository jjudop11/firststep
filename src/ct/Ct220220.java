package ct;

import java.util.Scanner;

public class Ct220220 {

	
	public static void main(String[] args) { // 1번째 풀이
		
		/*가로 길이가 Wcm, 세로 길이가 Hcm인 직사각형 종이가 있습니다. 
		 * 종이에는 가로, 세로 방향과 평행하게 격자 형태로 선이 그어져 있으며, 모든 격자칸은 1cm x 1cm 크기입니다. 
		 * 이 종이를 격자 선을 따라 1cm × 1cm의 정사각형으로 잘라 사용할 예정이었는데, 
		 * 누군가가 이 종이를 대각선 꼭지점 2개를 잇는 방향으로 잘라 놓았습니다. 
		 * 그러므로 현재 직사각형 종이는 크기가 같은 직각삼각형 2개로 나누어진 상태입니다. 
		 * 새로운 종이를 구할 수 없는 상태이기 때문에, 
		 * 이 종이에서 원래 종이의 가로, 세로 방향과 평행하게 1cm × 1cm로 잘라 사용할 수 있는 만큼만 사용하기로 하였습니다.
		 * 가로의 길이 W와 세로의 길이 H가 주어질 때, 사용할 수 있는 정사각형의 개수를 구하는 solution 함수를 완성해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 입력: ");
		int garo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("세로 입력: ");
		int sero = sc.nextInt();
		sc.nextLine();
		
		long answer = 0; // int타입 범위 벗어남, long타입으로 선언
		
		for(int i = 0; i< garo; i++) {
            answer += sero*i / garo ;
        }
        
        System.out.println(answer * 2); // 반쪼개서 계산했으므로 *2
		
	}
	
	public long solution(int w, int h) { // 1번째 풀이
		
		long answer = 0;
        
		long wl = (long)w; // 가로 길이
		long hl = (long)h; // 세로 길이
		
		// 사용 가능한 직사각형 수 = 전체 직사각형 수 - (패턴에서 제외되는 직사각형 수 * 최대공약수)
		answer = (wl*hl)-((wl+hl)-gcd(wl, hl));
		
		return answer;
	}

	// 최대 공약수 (유클리드 호제법)
	// https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
	public static long gcd(long w, long h) {
		
		if(h == 0) {
			return w;
		}
		return gcd(h, w%h);
	}
}
