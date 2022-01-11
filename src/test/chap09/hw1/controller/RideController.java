package test.chap09.hw1.controller;

import test.chap09.hw1.model.vo.Guests;
import test.chap09.hw1.model.vo.RollerCoaster;

public class RideController {
	
	private Guests[] gs = new Guests[4];
	private Guests[] onBoard = new Guests[RollerCoaster.PREMITNUMBER];
	
	{
		gs[0] = new Guests("홍길동", 17, 'M', 120.2);
		gs[1] = new Guests("유관순", 20, 'F', 102.3);
		gs[2] = new Guests("김유신", 23, 'M', 110.4);
		gs[3] = new Guests("김흥부", 21, 'M', 112.5);
	}
	
	public RideController() {}
	
	public void cutGuests() {
		
		try {
			
			int count = 0;
			for(int i = 0; i < gs.length; i++) {
				
				// 허용키 상수값 크기 이상인 사람을 Guests객체 배열 onBoard에 담음
				if(RollerCoaster.CUTHEIGHT <= gs[i].getHeight()) { 
					onBoard[count++] = gs[i]; 
					// 허용키 넘는사람은 3명
					// 탑승허용수는 2명 
				}
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			String str = e.getMessage(); // Index 2 out of bounds for length 2
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호: "+str.charAt(6));
			
		} finally {
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("이번 차례 탑승 명단");
			for(Guests g: onBoard) {
				System.out.println(g.toString());
			}
			System.out.println("탑승자 요금: "+(RollerCoaster.PRICE*onBoard.length));
		}
		
	}
	
}
