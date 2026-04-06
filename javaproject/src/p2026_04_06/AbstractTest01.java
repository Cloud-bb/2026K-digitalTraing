package p2026_04_06;

abstract class AbstractClass { // 부모 클래스(추상 클래스)
	abstract void Method01(); // 추상 메소드

	void Method02() { // :메소드 이름만 있고, 내용이 없는 메소드
		System.out.println("Method02:  추상클래스에서 구현");
	}
}
//추상 클래스를 상속받으면, 추상클래스 안에있는 추상 메소드를 자식 구현 클래스에서 반드시 오버라이딩 해야한다.
class SubClass extends AbstractClass { // 자식 클래스
	@Override
	void Method01() {
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
}

class AbstractTest01 {
	public static void main(String args[]) {
		
		//추상 클래스는 자체적으로 객체 생성을 할 수 없다.
//		AbstractClass abs = new AbstarctClass();

		SubClass obj = new SubClass();
		obj.Method01();
		obj.Method02();
	}
}
