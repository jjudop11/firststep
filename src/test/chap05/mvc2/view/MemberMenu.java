package test.chap05.mvc2.view;

import java.util.Scanner;

import test.chap05.mvc2.controller.MemberController;
import test.chap05.mvc2.model.vo.Member;

public class MemberMenu {
	
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while (true) {
			
			System.out.println("==회원관리메뉴==");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("메뉴 다시 선택");
				
			}
		}
		
	}

	private void insertMember() {
		
		int memberCount = mc.getMemberCount();
		
		if(memberCount >= MemberController.SIZE) {
			System.out.println("더이상추가불가");
			return;
		}
		
		System.out.println("아이디입력: ");
		String id = sc.nextLine();
		
		Member m = mc.checkId(id);
		
		if(m == null) {
			
			System.out.println("비밀번호: ");
			String pwd = sc.nextLine();
			
			System.out.println("이름: ");
			String name = sc.nextLine();
			
			System.out.println("나이: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("성별m/f: ");
			char gender = sc.nextLine().toUpperCase().charAt(0);
			System.out.println();
			
			System.out.println("이메일: ");
			String email = sc.nextLine();
			
			m = new Member(id, pwd, name, age, gender, email);
			mc.insertMember(m);
			System.out.println("회원등록성공");
			
		} else {
			System.out.println("동일 아이디 존재, 등록 실패");
			return;
		}
		
		
	}
	
	private void searchMember() {
		
		while (true) {
			
			System.out.println("==회원정보검색==");
			System.out.println("1.아이디검색");
			System.out.println("2.이름검색");
			System.out.println("3.이메일검색");
			System.out.println("9.이전메뉴");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(1 <= menu && menu <= 3) {
				
				System.out.println("검색내용: ");
				String search = sc.nextLine();
				Member m = mc.searchMember(menu, search);
				
				if(m == null) {
					System.out.println("검색 결과 없음");
					
				} else {
					System.out.println(m.information());
				}
				
			} else if(menu == 9) {
				return;
				
			} else {
				System.out.println("메뉴다시선택");
				
			}

		}
	}
	


	private void updateMember() {

		while (true) {
			
			System.out.println("==회원정보수정==");
			System.out.println("1.비밀번호수정");
			System.out.println("2.이름수정");
			System.out.println("3.이메일수정");
			System.out.println("9.이전메뉴");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(1 <= menu && menu <= 3) {
				
				System.out.println("변경할 회원 아이디: ");
				String id = sc.nextLine();
				Member m = mc.checkId(id);
				
				if(m == null) {
					System.out.println("변경 할 회원 없음");
					
				} else {
					System.out.println(m.information());
					String update = sc.nextLine();
					mc.updateMember(m, menu, update);
					System.out.println("회원 정보 변경 완료");
				}

				
			} else if(menu == 9) {
				return;
				
			} else {
				System.out.println("메뉴다시선택");
				
			}
			
		}
	}
	

	private void deleteMember() {
		
		System.out.println("삭제할 회원 아이디: ");
		String id = sc.nextLine();
		
		Member m = mc.checkId(id);
		
		if(m == null) {
			System.out.println("삭제 할 회원 없음");
		} else {
			System.out.println("정말 삭제? y/n:");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				mc.deleteMember(id);
			} else {
				System.out.println("삭제 취소");
			}
		}
	}

	private void printAllMember() {
		
		Member[] mem = mc.getMem();
		for(int i = 0; i < mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}
	}

	private void sortMember() {
		
		Member[] sortMem = null;
		
		while (true) {
			
			System.out.println("==회원정보정렬==");
			System.out.println("1.아이디오름차순");
			System.out.println("2.아이디내림차순");
			System.out.println("3.나이오름차순");
			System.out.println("4.나이내림차순");
			System.out.println("5.성별내림차순");
			System.out.println("9.이전메뉴");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				return;
			default:
				System.out.println("메뉴 다시 선택");
			}
			
			for(int i = 0; i < sortMem.length; i++) {
				System.out.println(sortMem[i].information());
			}
		}
		
	}

}
