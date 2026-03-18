package p2026_03_18;

public class StringconcatExample {

	public static void main(String[] args) {
		//숫자연산
		int value = 10 + 2 +8 ;
		System.out.println("value : " + value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1:" + str1);
	
		String str2 = 10 + "2" + 8;
		System.out.println("str2:" + str2);
		
//		순차적으로 + 연산을 하기 때문에 이후 모든 연산이 결합(+)연산이 됨
		String str3 = "10" + 2 + 8;
		System.out.println("str3:" + str3);
		
		String str4 = "10" +( 2 + 8);
		System.out.println("str4:" + str4);
		
		
	}

}
