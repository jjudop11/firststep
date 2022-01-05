package test.chap05.mvc2.controller;

import test.chap05.mvc2.model.vo.Member;

public class MemberController {
	
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	// 초기화 블럭을 이용하여 기본적인 회원 5명을 초기화, memberCount = 5로 초기화
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		// 반환값: int memberCount
		
		return memberCount;
		
	}

	public Member[] getMem() {
		// 반환값: Member[] mem
		
		return mem;
		
	}
	
	public Member checkId(String userId) {
		// 매개변수: String userId 입력받음
		// 반환값: Member m = null 또는 Member m = mem[i] 
		
		Member m = null;
		
		for(int i = 0; i < memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) { // 매개변수값이랑 같은 mem[i]찾기
				m = mem[i];
			}
		}	
		return m; // 없으면 초기값 넘김
	}

	public void insertMember(Member m) {
		// 매개변수: Member m = new Member(userId, userPwd, name, age, gender, email) 입력받음
		// void이므로 반환값은 없고, 메소드내 수행문 실행
		
		mem[memberCount++] = m; 
		// 비어있는 mem에 새 유저 정보를 초기화
		// memberCount증가시켜놓음
		
	}

	public Member searchMember(int menu, String search) {
		// 매개변수: 메뉴번호와 검색내용을 입력받음
		// 반환값: Member searchMember = null 또는 Member searchMember = mem[i]
		
		Member searchMember = null; 
		
		for(int i = 0; i < memberCount; i++) {
		
			if(menu == 1) {// 아이디검색메뉴
				
				if(mem[i].getUserId().equals(search)) { // 검색내용 == 아이디  mem[i] 찾음
					searchMember = mem[i];
				}
				
			} else if(menu == 2) {// 이름검색메뉴
				
				if(mem[i].getName().equals(search)) { // 검색내용 == 이름  mem[i] 찾음
					searchMember = mem[i];
				}
				
				
			} else {//menu ==3 이메일검색메뉴
				
				if(mem[i].getEmail().equals(search)) { // 검색내용 == 이메일  mem[i] 찾음
					searchMember = mem[i];
				}
			}
			
		}
		return searchMember; // 없으면 초기값 넘김
	}

	public void updateMember(Member m, int menu, String update) {
		// 매개변수: 아이디가같은 mem[i], 메뉴번호, 수정하고싶은 내용을 입력받음
		// 반환값 없고 set메소드들을 수행
		
		switch (menu) {
		case 1:
			m.setUserPwd(update);
			break;
		case 2:
			m.setName(update);
			break;
		case 3:
			m.setEmail(update);
			break;
		}
		
	}

	public void deleteMember(String userId) {
		// 매개변수: 검색할 아이디 입력받음
		
		for(int i = 0; i < memberCount; i++) { // 값이 있는 mem[i] 배열들 중
			
			if(mem[i].getUserId().equals(userId)) { // 아이디같은 mem[i]를 찾으면, 찾은 mem[i] 부터
				
				// 만약 해당 회원이 마지막 회원이였을 경우
				if(i == memberCount-1) {
					mem[i] = null; // 해당 회원 삭제만하면 됨 (null로 대입)
					
				} else { // 만약 해당 회원이 마지막 회원이 아닌 중간에 있었던 회원이였을 경우
					
					for(int j = i; j < memberCount-1; j++) {
						mem[j] = mem[j+1]; // 앞열에 뒷열인 값을 덮어씌움, 계속반복하면 가장 마지막배열 mem[memberCount-1]은 필요가 없음
					
					}
					mem[memberCount-1] = null; // 필요없는 가장 마지막 배열 null로 초기화
				
				}
				memberCount--; // 값이 있는 배열이 줄었으므로 memberCount -1 감소시킴
				
			}
			
		}
		
	}

	public Member[] sortIdAsc() { 
		// 아이디 오름차순
		// 메소드를 실행한후 Member[] mem을 복사하고 원하는 순서로 정렬된 Member[] copy 를 반환
		
		Member[] copy = mem.clone();
		Member tmp;
		
		for(int i = 0; i < memberCount-1; i++) { // 초기값 기준: mem[0] ~ mem[3]까지
			
			for(int j = i+1; j < memberCount; j++ ) { 
				// 첫 for문에서 mem[0] 후 mem[1] , mem[2], mem[3], mem[4] 아이디값 비교
				// 첫 for문에서 mem[1] 후 mem[2] , mem[3], mem[4] 아이디값비교 
				// 첫 for문에서 mem[2] 후 mem[3], mem[4] 아이디값비교
				// 첫 for문에서 mem[3] 후 mem[4] 아이디값비교
				
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) { // 앞열과 뒷열 비교해서 앞열이 크면 양수, 앞열을 뒷열과 자리바꿈
					tmp = copy[i];
					copy[i] = copy[j]; 
					copy[j] = tmp; 
				}
				
			}
		}
		return copy;

	}

	public Member[] sortIdDesc() { 
		// 아이디 내림차순, 아이디 오름차순 반대로 
		
		Member[] copy = mem.clone();
		Member tmp;
		
		for(int i = 0; i < memberCount-1; i++) {
			
			for(int j = i+1; j < memberCount; j++ ) {
				
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) { // 앞열과 뒷열 비교해서 앞열이 작으면 음수, 앞열을 뒷열과 자리바꿈
					tmp = copy[i];
					copy[i] = copy[j]; 
					copy[j] = tmp; 
				}
				
			}
		}
		return copy;
	}

	public Member[] sortAgeAsc() {
		// 나이 오름차순, 아이디 오름차순과 같음
	
		Member [] copy = mem.clone();
		
		for(int i = 0; i < memberCount - 1 ; i++) {
			
			for(int j = i+1; j < memberCount; j++) {
				
				if(copy[i].getAge() - copy[j].getAge() > 0) { // 앞열 나이가 더 많으면 양수, 앞열을 뒷열과 자리바꿈
					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}
		}
		
		return copy;
	}
	

	public Member[] sortAgeDesc() {
		// 나이 내림차순, 아이디 내림차순과 같음
		
		Member [] copy = mem.clone();
		
		for(int i = 0; i < memberCount - 1; i++) {
			
			for(int j = i+1; j < memberCount; j++) {
				
				if(copy[i].getAge() - copy[j].getAge() < 0) { // 앞열 나이가 더 적으면 음수, 앞열을 뒷열과 자리바꿈
					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}
		}
		
		return copy;
	}
	
	
	public Member[] sortGenderDesc() {
		// 성별 순서 M -> F
		
		Member [] copy = mem.clone();
		Member tmp;
		
		for(int i = 0; i < memberCount - 1; i++) {
			
			for(int j = i+1; j < memberCount; j++) {
				
				if(String.valueOf(copy[i].getGender()).compareTo(String.valueOf(copy[j].getGender())) < 0) {
					tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp; 
				}
			}
		}
		
		return copy;

	}

}
