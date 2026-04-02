package p2026_04_02;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		//Integer 클래스는 기본 생성자를 제공하지 않기 때문에 기본생성자로 객체생성을 할 수 없다.
//		Integer num = new Integer();//오류발생
		
		//박싱(boxing) : heap 메모리를 박스로 생각하고 , stack 메모리에 저장된 
		//				10을 heap메모리에 복사하는것
//		1. Integer(int Value)
		int n = 10;
		Integer num01 = new Integer(n); //박싱
		
		//언박싱(unboxing) : heap 메모리에 있는 데이터를 stack메모리로 가져오는 것
		int n01 = num01.intValue(); //언박싱
		
		//2. Integer (String s)
		//자료형 변환 : "20" --> 20
		String s = "20";
		Integer num02 = new Integer(s);
		int n02 = num02.intValue();
		 
	}
}
