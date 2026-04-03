package p2026_04_03;

//부모 클래스 안에 있는 필드는 자식 클래스에게 상속된다. 
class Point2D02 {
	protected int x = 10;
	protected int y = 20;
}

class Point3D02 extends Point2D02 { // 자식클래스
	protected int z = 30;

	// x y 필드는 부모 클래스로부터 상속받아서 사용하고있다
	public void print() {
		System.out.println(x + ", " + y + ", " + z); // x와 y는 상속 받아 사용하는 멤버변수
	}
}

class SuperTest02 {
	public static void main(String[] args) {
		Point3D02 pt = new Point3D02();
		pt.print();

	}
}