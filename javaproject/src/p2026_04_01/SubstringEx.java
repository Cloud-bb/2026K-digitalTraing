package p2026_04_01;

public class SubstringEx {

	public static void main(String[] args) {
		// 아래와 같은 주민번호가 있을 때, 남자인지 여자인지를 판별하는 프로그램을 작성하시오.

		String jumin = "950101-4234567";
		String gender = jumin.substring(7, 8);

		if (gender.equals("1") || gender.equals("3")) {
			System.out.println("남자입니다");
		} else if (gender.equals("2") || gender.equals("4")) {
			System.out.println("여자입니다");
		} else {
			System.out.println("번호를 다시 확인해주세요");
		}

		// charAt()메소드 사용
		char gender2 = jumin.charAt(7);

		if (gender2 == '1' || gender2 == '3') {
			System.out.println("남자입니다");
		} else if (gender2 == '2' || gender2 == '4') {
			System.out.println("여자입니다");
		} else {
			System.out.println("번호를 다시 확인해주세요");
		}

	}

}
