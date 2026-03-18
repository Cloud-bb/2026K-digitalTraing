package p2026_03_18;

public class PromotionExample {

	public static void main(String[] args) {
//		###자동 타입 변환 : 작은 자료형 데이터를 큰 자료형 변수에 할당하는 경우
//		자료형 크기 : byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " +intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: "+intValue);
		
		intValue=50;
		long longValue = intValue;
		System.out.println("longValue :"+longValue);
		
		longValue=100;
		float floatValue = longValue;
		System.out.println("floatValue: "+floatValue);
		
		floatValue=100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue:"+doubleValue
				);
	}

}
