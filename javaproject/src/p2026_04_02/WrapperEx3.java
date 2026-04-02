package p2026_04_02;

//p523
//자동 박싱과 자동 언박싱
public class WrapperEx3 {

	public static void main(String[] args) {
		
		//자동박싱
		Integer obj1 = new Integer(100);
		Integer obj = 100;
		System.out.println("언박싱:"+obj1.intValue());
		System.out.println("자동 언박싱:"+obj1);
		
		//언박싱
		int value1 = obj.intValue();
		
		//자동 언박싱
		int value2 = obj;
		
		//연산시 자동 언박싱
		int result = obj + 100;
		System.out.println("result:"+result);
	}

}
