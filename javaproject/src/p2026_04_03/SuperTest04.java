package p2026_04_03;

//부모클래스의 은닉된 x, y를 자식 클래스에서 접근하기 위해서는 super를 이용한다.
class Point2D04 {
	protected int x = 10; // 은닉 변수
	protected int y = 20; // 혹은 쉐도우 변수
}

class Point3D04 extends Point2D04{ //자식클래스
  protected int x=40; //부모 클래스의 필드를 재정의
  protected int y=50; 
  protected int z=30;
  
  //자식 클래스에서 새로 정의한 x, y 값만 사용된다.ㅏ
  public void print( ){
    System.out.println(  x  +", "+y+", "+z);   //x와 y는 재 정의된 Point3D 클래스 소속
  }
  
  //super : 부모클래스를 의미한다.
  //super.x : 부모클래스의 은닉된 필드를 접근할 때 사용한다.
  //super.x 는 자식 클래스의 메소드 안에서만 사용할 수 있다.
  
  
  //부모클래스의 은닉 변수에 super.x 로 접근해서 사용한다.
  public void print02( ){
    System.out.println(super.x+", "+super.y+", "+z); //Point2D 클래스 소속 멤버변수로 접근
  }
}

class SuperTest04 {
	public static void main(String[] args) {
		Point3D04 pt = new Point3D04();
		pt.print(); // 40, 50, 30 // Point3D의 x, y
		pt.print02(); // 10, 20, 30 // Point2D의 x, y
	}
}