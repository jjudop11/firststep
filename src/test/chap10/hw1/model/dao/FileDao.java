package test.chap10.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	private Scanner sc = new Scanner(System.in);
	
	public FileDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("파일에 저장할 내용을 반복해서 입력하시오('exit'을 입력하면 내용 입력 끝) : ");
		
		while (true) {
			
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			} else {
				sb.append(str);
				sb.append("\n");
			}
			
		}
		
		System.out.println("저장? y/n");
		
		if(sc.nextLine().toUpperCase().charAt(0) == 'Y') {
			
			System.out.println("저장 파일 명: ");
			String fName = sc.nextLine();
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fName+".txt"))) {
				
				bw.write(sb.toString());
				System.out.println(fName+".txt 파일에 성공적 저장");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("다시 메뉴로");
			return;
		}
		
	}

	public void fileOpen() {
		
		System.out.println("열을 파일명: ");
		
		try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()+".txt"))) {
			
			String str = "";
			while ((str = br.readLine()) != null) { 
				System.out.println(str);
			}
			
			
		} catch (FileNotFoundException e) {

			System.out.println("존재하는 파일 없음");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void fileEdit() {
		
		System.out.println("열을 파일명: ");
		String fName = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fName+".txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fName+".txt",true))) {
			
			String str = "";
			while ((str = br.readLine()) != null) { 
				System.out.println(str);
			}
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				
				System.out.println("파일에 추가할 내용을 입력하시오 :('exit'을 입력하면 내용 입력 끝) : ");
				String str2 = sc.nextLine();
						
				if(str2.equals("exit")) {
					break;
				} else {
					sb.append(str2);
					sb.append("\n");
				}
				
			}
			
			System.out.println("저장? y/n");
			String save = sc.nextLine();
			
			if(save.toUpperCase().charAt(0) == 'Y') {
				
				bw.write(sb.toString());
				System.out.println(fName+".txt 파일에 성공적 저장");
				
			} else {
				System.out.println("수정 취소, 돌아가기");
				return;
			}
			
		} catch (FileNotFoundException e) {

			System.out.println("존재하는 파일 없음");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
