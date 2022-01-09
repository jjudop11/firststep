package test.chap07.practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	public GalaxyNote9() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeaCall() {
		System.out.println("번호를 누르고 통화버튼 누름");
	}

	@Override
	public void tackaCall() {
		System.out.println("수신 버튼을 누름");
		
	}

	@Override
	public void picture() {
		System.out.println("1200만 듀얼 카메라");
		
	}
	
	@Override
	public void charge() {
		System.out.println("고속충전, 고속 무선 충전");
		
	}

	@Override
	public void touch() {
		System.out.println("정전식, 와콤펜 지원");
		
	}

	@Override
	public void printMaker() {
		System.out.println("삼성");
		
	}
}
