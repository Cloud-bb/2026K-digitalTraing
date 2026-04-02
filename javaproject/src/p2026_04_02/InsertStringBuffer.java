package p2026_04_02;
public class InsertStringBuffer {
    public static void main( String[] args ) {
	StringBuffer sb1 = new 
			      StringBuffer("gemini is beautiful" );
	System.out.println( sb1 );

	//index (10)에 very 문자 삽입
	sb1.insert( 10, "very" );
	System.out.println( sb1 );

	sb1.insert( 0, 1004 );
	System.out.println( sb1 );
    }
}

