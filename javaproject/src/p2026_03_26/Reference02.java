package p2026_03_26;

public class Reference02 {

	public static void main(String[] args) {

		//참조형 : 클래스
		String str1 = "자바"; //처음 1번만 heap 메모리 영역에 자바 객체를 생성
		String str2 = "자바";
		String str3 = new String("자바");
		String str4 = new String("자바");

		// 비교 연산자로 참조하는 주소를 비교
		if (str1 == str2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		if (str3 == str4) {
			System.out.println("같은주소");
		} else {
			System.out.println("다른 주소");
		}
		
		//참조하는 값(데이터) 비교
		//boolean equals()
		if(str1.equals(str2)) {
			System.out.println("참조하는 값이 같다");
		}else {
			System.out.println("참조하는 값이 다르다");
		}
		
		//참조형 : 배열
		//1. int형 배열을 생성하면 heap메모리에 int(4byte)기억공간을 3개를 연속적으로 생성한다
		//2. 배열 변수 s 는 배열의 시작 주소를 가지고 있다.
		//3. int형 배열을 생성하면 배열의 원소들은 모두 0으로 초기화된다.
		int[] s = new int[3];
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	}

}
