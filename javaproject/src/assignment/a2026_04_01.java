package assignment;

import java.util.Scanner;

public class a2026_04_01 {
//	1. 키보드를 통해서 주민번호를 입력 했을때 유효한 
//    주민번호 인지 아닌지를 판별하는 프로그램을 작성 
//    하세요?
//    (단, 유효하지 않은 주민번호의 경우에는 메시지를 출력)
//
// 1. 주민번호 앞자리 6자리가 아니면 메시지 출력
// 2. 주민번호 뒷자리 7자리가 아니면 메시지 출력
// 3. 유효한 주민번호 아니면 메시지 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 예외:프로그램에서 예상하지 못한 오류를 의미한다.
		// 예외처리 : 프로그램을 안전하게 종료시키기 위해서 예외처리를 한다. 주로 입출력을 처리할 떄 예외처리를 해야한다.
		try {

			System.out.println("주민번호 앞자리를 입력하세요");
			String jumin1 = sc.nextLine();
			System.out.println("주민번호 뒷자리를 입력하세요");
			String jumin2 = sc.nextLine();
			String jumin = jumin1 + jumin2;

			// 유효성 검사
			if (jumin1.equals("")) {
				System.out.println("주민번호 앞자리를 입력하세요");
			} else if (jumin1.length() != 6) {
				System.out.println("주민번호 앞자리 6자리를 입력하세요");
			} else if (jumin2.equals("")) {
				System.out.println("주민번호 뒷자리를 입력하세요");
			} else if (jumin2.length() != 7) {
				System.out.println("주민번호 뒷자리 7자리를 입력하세요");
			} else if (!checkJumin(jumin)) {
				System.out.println("잘못된 주민번호입니다");
			} else {
				System.out.println("올바른 주민번호입니다");
			}

		} catch (Exception e) {
			System.out.println("잘못된 정보입니다");
		}

	}

	// jumin1 + jumin2 를 한 결과를 int 로 치환 후 배열로 한글자씩 저장.
	public static boolean checkJumin(String jumin) {
		String list[] = jumin.split("");

		int[] checkNum = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			sum += Integer.parseInt(list[i]) * checkNum[i];
		}
		sum = sum % 11;
		sum = 11 - sum;
		if (sum >= 10)
			sum = sum % 10;

		if (sum == Integer.parseInt(list[12])) {
			return true;
		} else {
			return false;
		}

	}

}
