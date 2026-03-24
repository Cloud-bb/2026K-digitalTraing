package p2026_03_24;

public class MethodEx01 {

//		사용자 정의 메소드
//		사용자 정의 메소드는 프로그래머가 직접 호출해야 실행된다 .
	static void check() {  //static:정적 메소드
		//void: 값을 돌려주지 않겠다는 의미
		System.out.println("메소드 호출 성공");
		return; //생략가능
}
	
		static void check(int a) {
			System.out.println("전달된 값 :" +a);
		}
		static void check(int a, double d) {
			double result = a+d;
			System.out.println("전달된 값의 합 :" + result);
		}
		static void check(char c) {
			System.out.println("전달된 값"+c);
		}
		static void check(boolean b) {
			System.out.println("전달된 값 "+b);
		}
//		주소값 전달에 의한 메소드 호출방식 (Call by Reference방식)
		static void check(String s) {
			System.out.println("전달된 값"+s);
		}
		
		static int check01() {
			System.out.println("리턴구문");
			return 50;
//			return 50.0; //return은 자료형과 동일시해야한다. 메소드 가장 아랫줄에 위치할것.
		}
		
		//값 전달에 의한 메소드 호출방식(Call by Value방식) 
		static void main(String[] args) {
			MethodEx01.check(); // 메소드 호출
			check(20, 41.5);// 같은 클래스 내에 있는 정적메소드 호출시에는 클래스명 생략가능
			
			check01(); //return문으로 돌려받은 값이 출력되지 않는다.
		}
}
