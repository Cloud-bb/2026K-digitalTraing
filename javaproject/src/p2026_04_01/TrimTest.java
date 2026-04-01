package p2026_04_01;

public class TrimTest {

	// trim() : 문자열 좌우의 공백을 없애준다
    public static void main( String[] args ) {
	String str1 = new String( "자바   " );
	String str2 = new String( "   자바 " );
	
	System.out.println();

	System.out.println( str1.equals( str2 ));
	System.out.println( str1.trim().equals( str2.trim()));
    }
}
		