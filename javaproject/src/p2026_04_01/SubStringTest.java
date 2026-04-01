package p2026_04_01;

//substring() : 전체 문자열에서 특정 범위의 문자를 추출하는 메소드

//substring(int beginIndex) : beginIndex 번호부터 문자열 끝까지 추출
//substring(int beginIndex,int endIndex) : beginIndex 번호부터 endIndex -1번 문자열까지 추출
public class SubStringTest {
    public static void main( String[] args ) {
		
	String message = "Java program creates many objects.";
		
//	index 번호 13부터 끝까지 문자를 추출
	String str1 = message.substring( 13 );
	System.out.println( str1 );

//	index 번호 13부터 16번째까지 문자를 추출
	String str2 = message.substring( 13, 16 );
	System.out.println( str2 );
    }
}
