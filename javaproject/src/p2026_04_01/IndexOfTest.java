package p2026_04_01;

//indexOf() : 특정 문자의 인덱스 번호를 구해주는 메소드
public class IndexOfTest {
	public static void main( String[] args ) {
		
	String message = "Java program creates many objects.";

	//가장 먼저 나오는 'a'의 인덱스번호를 구해준다
	int index1 = message.indexOf( 'a' );
	System.out.println( index1 ); 	//1
	
	//10진수 아스키코드값(97)에 해당되는 문자('a')의 인덱스 번호를 구해준다
	int index2 = message.indexOf( 97 );
	System.out.println( index2 ); //1

	//10진수 아스키코드값(65)에 해당되는 문자('A')의 인덱스 번호를 구해준다
	//indexOf()메소드는 찾는 문자가 없을 경우에 -1을 리턴한다.
	int index33 = message.indexOf(65);
	System.out.println(index33);	//-1
	
	//index번호 13번째 이후에서 a를찾음
	int index3 = message.indexOf( 'a', 13 ); 
	System.out.println( index3 );	//16

	//av문자로 시작하는 인덱스번호를 구한다.
	int index4 = message.indexOf( "av" );
	System.out.println( index4 ); //1

	//인덱스 번호 12번 이후의 'man' 의 인덱스 번호를 구해준다
	int index5 = message.indexOf( "man", 12 );
	System.out.println( index5 );	//21

	int index6 = message.indexOf( "java" );
	System.out.println( index6 );
    }
}



