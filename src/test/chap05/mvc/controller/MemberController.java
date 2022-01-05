package test.chap05.mvc.controller;

import test.chap05.mvc.model.vo.Member;

public class MemberController {
	
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);

	public int login(String id, String pwd) {
		
		if(mem.getMemberld().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1;
		} 
		return 0;
	}

	public Member readinfo() {
		
		return mem;
		
	}

	public int readAge() {
		
		String birth = 19+mem.getCitizenNo().substring(0, 2);
		int result = (2021 - Integer.parseInt(birth))+1;
		return result;
	}

	public void updateHeight(double height) {
		
		mem.setHeight(height);
		
	}
}
