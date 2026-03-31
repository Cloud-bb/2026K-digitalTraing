package p2026_03_31;

// 1. 같은 패키지 안에 들어 있는 클래스에 접근하기 위해서는 접근제한자가 
//public이나 default접근 제어자로 되어있어야 한다.
//2. 같은 패키지 안에 들어있는 클래스에 접근하기 위해서는 import를 하지 않아도 된다
public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Called c = new Called();
		c.check();
	}

}
