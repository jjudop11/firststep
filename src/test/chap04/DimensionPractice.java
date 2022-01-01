package test.chap04;

import java.util.Scanner;

public class DimensionPractice {
	
	private	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[][] arr = new int[4][4];
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = count++;
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		  
	}
	
	public void practice2() {
		

		int[][] arr = new int[4][4];
		int count = 16;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = count--;
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice3() {
		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = "("+i+", "+j+")";
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {

				if(i <= arr.length-2 && j <= arr[i].length-2) {
					arr[i][j] =  (int)(Math.random()*10+1);
					arr[i][arr[i].length-1] +=  arr[i][j]; 
					arr[arr.length-1][j] += arr[i][j];
					arr[arr.length-1][arr[i].length-1] += arr[i][j];
				}
				
				
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice5() {
		
		while(true) {
 		
			System.out.println("행 크기: ");
			int h = sc.nextInt();
			sc.nextLine();
			if(0 < h && h <= 10) {
				
				System.out.println("열 크기: ");
				int y = sc.nextInt();
				sc.nextLine();
				
				if(0 < y && y <= 10) {
					
					char[][] arr = new char[h][y];
					
					for(int i = 0; i < arr.length; i++) {
						
						for(int j = 0; j < arr[i].length; j++) {
							
							arr[i][j] = (char)(Math.random()*26+65);
							System.out.print(arr[i][j]+" ");
						}
						System.out.println();
					}
					return;
					
				} else {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				}
				
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
	}
	
	public void practice6() {
		
		String[][] strArr = new String[][] { {"이", "까", "왔", "앞", "힘"}, 
											 {"차", "지", "습", "으", "냅"}, 
											 {"원", "열", "니", "로", "시"},
											 {"배", "심", "다", "좀", "다"}, 
											 {"열", "히", "! ", "더", "!! "} };
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
											 
	}
	
	public void practice7() {
		
		System.out.println("행 크기: ");
		int h = sc.nextInt();
		sc.nextLine();
		
		char ch = 'a';
		char[][] arr = new char[h][];
		
		for(int i = 0; i < h; i++) {
			System.out.println(i+"행의크기: ");
			int y = sc.nextInt();
			sc.nextLine();
			arr[i] = new char[y];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void practice8() {
		
		String[] arr = new String[] {"강건강", "남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] one = new String[3][2];
		String[][] two = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < one.length; i++) {
			
			for(int j = 0; j < one[i].length; j++) {
				one[i][j] = arr[count++];
				System.out.print(one[i][j]+" ");
				
			}
			System.out.println();
			 
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < two.length; i++) {
			
			for(int j = 0; j < two[i].length; j++) {
				two[i][j] = arr[count++];
				System.out.print(two[i][j]+" ");
				
			}
			System.out.println();
			 
		}

	}
	
	public void practice9() {
		
		String[] arr = new String[] {"강건강", "남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] one = new String[3][2];
		String[][] two = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < one.length; i++) {
			
			for(int j = 0; j < one[i].length; j++) {
				one[i][j] = arr[count++];
				System.out.print(one[i][j]+" ");
				
			}
			System.out.println();
			 
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < two.length; i++) {
			
			for(int j = 0; j < two[i].length; j++) {
				two[i][j] = arr[count++];
				System.out.print(two[i][j]+" ");
				
			}
			System.out.println();
		
		}
		
		System.out.println("============================");
		System.out.println("검색할 학생 이름을 입력하세요: " );
		String student = sc.nextLine();
		
		for(int i = 0; i < one.length; i++){
			
			for(int j = 0; j < one[i].length; j++){
				
				if(one[i][j].equals(student)) {
						String position = " ";
					if(j == 0) {
						position = "왼쪽";
					} else {
						position = "오른쪽";
					}
					System.out.println("검색하신 "+student+"학생은 1분단 "+(i+1)+"번째 줄 "+position+"에 있습니다.");
					
				} 
			}
		}
		
		
		for(int i = 0; i < two.length; i++){
			
			for(int j = 0; j < two[i].length; j++){
				
				if(two[i][j].equals(student)) {
						String position = " ";
					if(j == 0) {
						position = "왼쪽";
					} else {
						position = "오른쪽";
					}
					System.out.println("검색하신 "+student+"학생은 2분단 "+(i+1)+"번째 줄 "+position+"에 있습니다.");
				
				} 
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		DimensionPractice d = new DimensionPractice();
		d.practice9();

	}

	

}
