package p2026_03_18;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
//		char charValue =  intValue; // 타입오류 발생
		System.out.println(charValue);
		
		long longValue =500;
		intValue= (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
