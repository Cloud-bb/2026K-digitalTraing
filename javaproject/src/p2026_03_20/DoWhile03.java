package p2026_03_20;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		System.out.println("메세지를 입력 하세요?");
		System.out.println("프로그램을 종료하려면 q를 입력 하세요.");
		
		Scanner sc = new Scanner(System.in);
		String input="";
		
		do {
			System.out.print(">");
			
			input = sc.nextLine();//키보드로 입력한 내용을 문자로 입력 받는다.		
			System.out.println("입력문자:"+ input);
			
		// boolean equals(): 문자열 값을 비교하는 메소드	
			
		}while(!input.equals("q"));
		sc.close();
	}

}
