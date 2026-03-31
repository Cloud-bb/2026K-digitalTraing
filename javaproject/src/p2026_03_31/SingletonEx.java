package p2026_03_31;

//p302
//싱글톤(singleton) : 객체 생성을 1번만 수행하는 것 
class Singleton {
	private static Singleton s = new Singleton();

	private Singleton () {}; // 직접 객체생산을 막아주는 역할

	// 정적 메소드를 이용해서 싱글톤 객체 s 공유를 수행한다
	public static Singleton getInstance() { // 정적메소드
		return s;
	}

	public void check() {
		System.out.println("메소드 호출 성공1");
	}

	public void check2() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEx {

	public static void main(String[] args) {

//	private 접근 제어자 때문에 외부클래스에서 직접 접근할 수없다..
//	 System.out.println(Singleton.s);//컴파일 에러
//	 System.out.println(Singleton.s);//컴파일 에러
//	 

		// 생성자의 접근 제어자를 private로 설정해서 직접 객체 생성을 할수가없다.
//	 Singleton s2 = new Singleton());
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		obj1.check();
		obj1.check2();
		obj2.check();
		obj2.check2();
	}
}
