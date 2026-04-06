package p2026_04_06;
//p342~343

class Airplane { // 부모클래

	public void land() {
		System.out.println("착륙합니다.");
	}

	public void fly() { // 은닉 메소드
		System.out.println("일반비행합니다.");
	}

	public void takeoff() {
		System.out.println("이륙 합니다.");
	}
}

//1. 부모 클래스의 메소드는 자식 클래스에 상속된다.
//2. 부모 클래스의 fly()메소드를 자식 클래스에서 메소드 오버라이딩을 하면 자식 클래스에서 메소드 오버라이딩된 메소드만 호출된다.
//3. 부모 클래스의 fly()메소드는 더이상 사용할 수 없는 은닉 메소드가 된다.
//4. 부모 클래스의 은닉 메소드를 자식 클래스에서 호출할때는  super.fly()로 호출해야한다.
class SuperSonicAirplane extends Airplane { // 자식 클래스
	public static final int NORMAL = 1; // 정적 필드(상수)
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	// 메소드 오버라이딩(Method Overriding)
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 부모클래스의 은닉 메소드 호출
		}
	}
}
public class SuperSonicAirplaneExample {

	public static void main(String[] args) {

		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeoff(); // 상속받은 메소드 호출
		sa.fly(); // 오버라이딩된 메소드 호출

		sa.flyMode = SuperSonicAirplane.SUPERSONIC; // 2
		sa.fly();

		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();

		sa.land();

	}

}
