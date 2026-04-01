package p2026_04_01;

//split() : 전체 문자열에서 구분기호를 이용해서 파싱한 후에 String 형 배열로 return 하는 메소드
//String[] : split (String regex)
//String[] : split ("구분기호")

public class SplitEx {

	public static void main(String[] args) {

		String jumin = "950101-1234567";

		String[] j = jumin.split("-");
		System.out.println(j[0]);
		System.out.println(j[1]);
		for (int i = 0; i < j.length; i++)
			System.out.print(j[i] + '\t');
		System.out.println();
		for (String s : j)
			System.out.print(s + "\t");
		
		String tel = "010-1234-5678";
		String[] t = tel.split("-");
		System.out.println("전화번호 앞자리:" + t[0]);
		System.out.println("전화번호 중간자리:" + t[1]);
		System.out.println("전화번호 뒷자리:" + t[2]);
		
		String email = "totoro@naver.com";
		String[] e = email.split("@");
		System.out.println("아이디:"+e[0]);
		System.out.println("도메인:"+e[1]);
		
		
	}

}
