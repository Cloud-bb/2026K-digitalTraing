package p2026_04_03;

//메소드 오버라이딩(Method Overrriding)
//부모클래스로부터 상속받은 메소드를 자식 클래스에서 재정의해서 사용하는 것
//1. 자식 클래스로 객체를 생성한 다음에 메소드를 호출하면 , 오버라이딩된 메소드만 호출된다
//2. 부모 클래스에서 상속해주는 메소드는 더 이상 사용할 수 없는 은닉 메소드가 된다.
//3. 부모 클래스의 은닉 메소드를 자식 클래스에서 사용할 때는 super.parentPrn()으로 호출할 수 있다.


class Parent05 { // 부모 클래스 : Parent05
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child05 extends Parent05 { // 자식 클래스 : Child05

	@Override // 오버라이딩 검증
	public void parentPrn() {
		super.parentPrn();
		System.out.println("서브 클래스 : ParentPrn 메서드");
	}

	public void childPrn05() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class SuperSub05 {
	public static void main(String[] args) {
		Child05 c = new Child05();
		c.parentPrn();
		c.childPrn05();
		System.out.println("-------------------------------------------->> ");
		Parent05 p = new Parent05();
		p.parentPrn();
	}
}