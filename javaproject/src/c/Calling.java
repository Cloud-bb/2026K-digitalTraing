package c;

import a.b.Called;

//1. 다른 패키지 안에 들어있는 클래스에 접근하기 위해서는 접근제어자가 public 접근 제어자로 되어있어야 한다.
//2. 다른 패키지 안에 들어있는 클래스에 접근하기 위해서는 해당 클래스를 import해야한다.
public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Called c = new Called();
		c.check();
	}

}
