package p2026_04_02;

public class StringBufferTest {
	public static void main(String[] args) {

		//length() : 문자열의 길이를 구해주는 메소드
		//capacity() : heap메모리상에 할당된 공간의 크기를 구해오는 메소드 (기본값 16byte)
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		
		//StringBuffer 클래스는 메소드에 의해서 값의 변화가 일어나면 heap메모리 상에 새로운 공간을 할당받지않고, 동적으로 공간의 크기가 자동으로 늘어난다
		sb1.append("A string buffer implements" + "a mutable sequence of characters");
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		StringBuffer sb2 = new StringBuffer();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}
}
