package p2026_04_06;

//p341

class Calculator { //부모 클래스
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator {

	@Override
	double areaCircle(double r) { //자식클래스
		super.areaCircle(r);
		System.out.println("Coumputer 객체의 areaCircle()실행");
		return Math.PI * r * r;
	} 
	
}

public class ComputerExample {

	public static void main(String[] args) {
		int r =10;
		
		//부모 클래스로 객체를 생성 후에 areaCircle()메소드를 호출하면
		//부모 클래스 안에 있는 areaCircle()메소드만 호출된다
		Calculator cal = new Calculator(); //부모클래스로 객체 생성
		System.out.println("원의 면적 : "+cal.areaCircle(r));
		
		//자식 클래스로 객체를 생성 후에 areaCircle()메소드를 호출하면 
		//자식 클래스에서 메소드 오버라이딩된 메소드만 호출된다.              
		Computer com = new Computer();
		System.out.println("원의 면적 : "+com.areaCircle(r));
		System.out.println();
	}

}
