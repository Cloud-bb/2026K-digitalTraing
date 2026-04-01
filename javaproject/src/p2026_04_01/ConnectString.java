package p2026_04_01;

public class ConnectString {
	
    public static void main( String[] args ) {
	// String 객체 선언
	String str1 = "자바";
	String str2 = "스크립트";
		
	// 두 String 객체를 "+" 연산 수행
	String temp = str1 + str2;
	System.out.println( temp );
	System.out.println( "자바" + "스크립트" );

	// String + 정수형
	String temp2 = temp + 100;
	System.out.println( temp2 );
    }
}

