package p2026_03_31;

class FinalMethod { 	 //부모 클래스
	String str = "Java ";

	// public void setStr(String s) {
	// 부모 클래스의 메소드에 final 붙이면 자식 클래스에서 오버라이딩을 허용하지 않는다
	public final void setStr(String s) {
		str = s;
		System.out.println(str);
	}
}

class FinalEx extends FinalMethod {   		 // calss {클래스명} extends {부모클래스명}		
	int a = 10; // final 붙이면 밑에서 a값 대입 불가.

	public void setA(int a) {
		this.a = a;
	}

	//메소드 오버라이딩 : 부모클래스로부터 상속받은 메소드를 자식 클래스에서 메소드 이름과 형식을 그대로 사용하면서 
	//메소드 내용을 다르게 사용하는 것
	public void setStr(String s) { // 메소드 오버라이딩
		str += s;
		System.out.println(str);
	}

}

public class FinalTest02 {
	public static void main(String[] args) {
		FinalEx ft = new FinalEx();
		ft.setA(100);
		ft.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
		FinalMethod ft1 = new FinalMethod();
		ft1.setStr("hi");// 자신의 클래스의 setStr을 실행.
	}
}