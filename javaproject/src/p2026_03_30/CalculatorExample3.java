package p2026_03_30;

//p298
//정적필드, 정적 메소드
//1. 정적필드와 정적메소드는 공유를 목적으로 누구나 쉽게 사용할 경우만 사용한다. 
//2. 정적필드와 정적메소드를 호출할 때는 클래스로 객체를 생성하지 않고 
// 	`클래스명.정적필드` , `클래스명.정적메소드`로 호출한다.
class Calculator3{
	int k;  		//인스턴스 필드
	static int i;
	static double d; 
	static boolean b;
	static double pi = 3.14159;    //정적 필드
	
//	static void check() {
//		System.out.println(k); //에러발생 : 정적 메소드 안에는 정적 필드만 사용가능
//	}
	static int plus(int x, int y) {			//정적 메소드
		return x+y;
	}
	static int minus (int x, int y) {		//정적 메소드
		return x -y;
	}
	
}
public class CalculatorExample3 {

	public static void main(String[] args) {
		//정적필드는 `클래스명.(점)`으로 접근한다
		double result1 = 10* 10 * Calculator3.pi;
		//정적메소드를 호출할때는 클래스명으로 점(.)으로 접근한다. new생성자를 사용할 필요 x)
		int result2 = Calculator3.plus(10,5);
		int result3 = Calculator3.minus(10,5);
		
		System.out.println("i = "+ Calculator3.i);
		System.out.println("d = "+ Calculator3.d);
		System.out.println("b = "+ Calculator3.b);
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		
	}

}
