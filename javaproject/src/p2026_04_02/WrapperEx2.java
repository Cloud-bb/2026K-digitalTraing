package p2026_04_02;
	//p522
	//박싱과 언박싱
public class WrapperEx2 {

	public static void main(String[] args) {
		//박싱
		Integer obj1 = new Integer(10);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		//언박싱(unboxing)
		int value2 = obj2.intValue(); //언박싱이 되는 과정에서 자료형변환이 일어난다
		int value1 = obj1.intValue(); //"200" ---> 200
		int value3 = obj3.intValue(); //"300" ---> 300
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
