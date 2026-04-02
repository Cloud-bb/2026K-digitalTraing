package p2026_04_02;

//p524
//문자열을 기본자료형으로 변환 : "20"--->18
public class WrapperEx5 {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		boolean value4 = Boolean.parseBoolean("TRUE");
		boolean value5 = Boolean.parseBoolean("TEST");

		System.out.println("value1:" + value1);
		System.out.println("value2:" + value2);
		System.out.println("value3:" + value3);
		System.out.println("value4:" + value4);
		System.out.println("value5:" + value5);

	}
}
