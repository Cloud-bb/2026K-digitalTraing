package p2026_03_19;

public class If01 {

	public static void main(String[] args) {
		if(10 > 5) {
			System.out.println("실행1");
		}
		//실행될 문장이 1줄인 경우에는 중괄호 {}를 생략할 수 있다.
		if(10 > 5) 
			System.out.println("실행1");
		
		 
		
		if(true) {
			System.out.println("무조건실행");
		}
		if(false) {
			System.out.println("실행안됨");
		}
		//if문에 중괄호({})가 없으면 if문 바로 아랫쪽 줄만 if문의 적용을 받는다
		if(10 > 30)
			System.out.println("출력안됨");
			System.out.println("조건식의 적용을 받지 않고 실행");
		
	}

}
