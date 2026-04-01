package p2026_04_01;

import java.util.Scanner;

public class JuminCheck {

	public static void main(String[] args) {
//		키보드로 주민번호를 입력받아서 남자, 여자인지를 판별하는 프로그램을 작성하시오.
// 		단, 주민번호 앞자리는 6자리 뒷자리는 7자리인지를 유효성검사를 한다
		Scanner sc = new Scanner(System.in);
		
		//예외:프로그램에서 예상하지 못한 오류를 의미한다.
		//예외처리 : 프로그램을 안전하게 종료시키기 위해서 예외처리를 한다. 주로 입출력을 처리할 떄 예외처리를 해야한다.
		try {
			
			System.out.println("주민번호 앞자리를 입력하세요");
			String jumin1 = sc.nextLine();
			System.out.println("주민번호 뒷자리를 입력하세요");
			String jumin2 = sc.nextLine();
			
			String g = jumin2.substring(0,1);
			
			//유효성 검사
			if(jumin1.equals("")){
				System.out.println("주민번호 앞자리를 입력하세요");
			}else if(jumin1.length() != 6) {
				System.out.println("주민번호 앞자리 6자리를 입력하세요");
			}else if(jumin2.equals("")) {
				System.out.println("주민번호 뒷자리를 입력하세요");
			}else if(jumin2.length() != 7) {
				System.out.println("주민번호 뒷자리 7자리를 입력하세요");
			}else if(g.equals("1")||g.equals("3")) {
				System.out.println("남자");
			}else if(g.equals("2")||g.equals("4")) {
				System.out.println("여자");
			}else {
				System.out.println("똑바로 입력하세요");
			}
			
		}catch(Exception e) {
			System.out.println("잘못된 정보입니다");
		}

	}

	
}
