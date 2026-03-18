package p2026_03_18;

public class LongOperationExample {

	public static void main(String[] args) {
		
//		1.같은 자료형 변수에 산술연산을 수행하면 결과는 같은 자료형으로 처리된다.(중요!!!)
//		int형 변수와 int형 변수를 산술연산 수행하면 결과는 int형으로 처리됨
		int v1 = 10;
		int v2 = 20;
		int result = v1 + v2;
		System.out.println(result);
		
		double v3 =3.14;
		double v4 = 42.195;
		double result2 = v3+v4;
		System.out.println(result2);
		
//		2.서로 다른 자료형이 변수를 산술연산(+)을 수행하면 결과는 가장 큰 자료형으로 자동 형변환된다.
		byte value1 = 10;	//1byte
		int value2 = 100;	//4byte
		long value3 = 1000L;	//8byte
		double value4 = 3.14;	//8byte

		double result3 = value1 + value2 + value3 + value4;
		System.out.println(result3);
	}

}
