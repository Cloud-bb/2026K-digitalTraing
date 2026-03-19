package p2026_03_19;

public class Oper08 {

	public static void main(String[] args) {

		//논리 연산자(&&), or(||), not(!)
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println(!true);
		System.out.println(!false);

		if(!b2) {
			System.out.println("출력 성공");
		}
	}

}
