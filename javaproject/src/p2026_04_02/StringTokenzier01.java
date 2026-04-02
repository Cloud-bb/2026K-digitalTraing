package p2026_04_02;

import java.util.StringTokenizer;

public class StringTokenzier01 {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#");

		// 토큰(token): 구분기호 (#)로 분리된 문자
		// ex) 이순신, 을지문덕, 강감찬, 광개토대왕
		int cnt = str.countTokens();
		System.out.println("파싱된문자 (=토큰)의 갯수" + cnt);

		System.out.println(str.nextToken()); //이순신
		System.out.println(str.nextToken()); //을지문덕
		System.out.println(str.nextToken()); //강감찬
		System.out.println(str.nextToken()); //광개토대왕
//		System.out.println(str.nextToken());

		// boolean hasMoreTokens() : 남아있는 토큰 여부를 판별하는 메소드
		while (str.hasMoreTokens()) { // 토큰이 있으면
			System.out.println(str.nextToken()); // 차례대로 파싱된 문자열을 얻어온다
		}

		String str2 = "이순신#을지문덕#강감찬#광개토대왕";
		String[] s = str2.split("#");
		for (String s2 : s) {
			System.out.println(s2);
		}
	}

}
