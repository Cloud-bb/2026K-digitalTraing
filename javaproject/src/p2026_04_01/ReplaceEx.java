package p2026_04_01;

//p516
//String replace(oldChar, newChar) : oldChar를 newChar로 치환해주는 메소드
public class ReplaceEx {

	public static void main(String[] args) {

		String oldStr = "자바는 객체지향 언어 입니다";
		
		String newStr = oldStr.replace("자바","Java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
