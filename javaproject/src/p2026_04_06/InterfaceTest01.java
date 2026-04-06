package p2026_04_06;

interface IHello01 {
	void sayHello(String name);
}

//인터페이스를 상속 받을 때는 implement로 상속 받는다.
class Hello01 implements IHello01 {

	// 부모 인터페이스 안에 있는 추상 메소드는 상속받는 자식구현 클래스에서 반드시 메소드 오버라이딩을 해야한다.
	@Override

	public void sayHello(String name) {
//	void sayHello(String name){
		System.out.println(name + "씨 안녕하세요!");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		
		//인터페이스는 자체적으로 객체 생성을 할 수 없다
//		IHello01 ih = new IHello01(); //에러발생
		Hello01 obj = new Hello01();
		obj.sayHello("홍길동");	//메소드 오버라이딩된 메소드가 호출된다.
		obj.sayHello("홍길동");
	}
}
