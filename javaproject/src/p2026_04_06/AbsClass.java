package p2026_04_06;

public abstract class AbsClass {        // 추상클래스

	int a = 10; // 필드

	void check() {
		System.out.println("호출성공");   // 일반 메소드
	}
	public AbsClass() {					//생성자
		
	}
	
	//추상 메소드 :메소드 이름만 있고 내용이 없는 메소드
	abstract void check2(); // 추상메소드
}
