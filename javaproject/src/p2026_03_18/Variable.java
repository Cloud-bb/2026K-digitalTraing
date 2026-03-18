package p2026_03_18;

public class Variable {

	public static void main(String[] args) {
//		변수 : 메모리 사에 데이터를 저장하기 위한 기억 공간의 이름
//		변수 만드는 방법 : 자료형 변수형 = 데이터 (값)
		
//		***기본 자료형 변수
//		1. 정수형 변수
		byte b1 = 10;  // -128 ~ 127
//		byte b2 = 130;  // 오버플로우발생
		short s = 100;  // -32768 ~ 32767
		int i = 1000;  //-21억 ~ 21억
		long l = 10000L; //long 형은 마지막에 L 을 붙여줄것
		char c = 12; // 0 ~ 655535(유니코드)
		
		System.out.println("b1 ="+b1);
		System.out.println("s="+s);
		System.out.println("i ="+i);
		System.out.println("l = "+l);
		System.out.println("c = " +c);
		
// 		2. 실수형 변수
		float ft1 = 3.14f; //float형은 f를 붙여야한다
		float ft3= (float)3.14; //double(8byte) 울 float(4byte)형으로 강제 형변환
		
		double d = 42.195;
		System.out.println("ft1 = "+ft1);
		System.out.println("d = "+d);
		System.out.printf("%.1f\n",d);//소수 첫째자리까지 출력 : 42.2
		System.out.printf("%.2f",d);//소수 둘째자리까지 출력 : 42.20
		System.out.println();
		
//		3. 문자형 변수
		char c1 = 'A';
		char c2 = '안';
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		
//		4.논리형 변수
		boolean bn1 =true;
		boolean bn2 =false;
		System.out.println("bn1="+bn1);
		System.out.println("bn2="+bn2);
		
//		***참조형  변수 : 클래스(string)
		String s1 = "자바";
		String s2 = new String("자바");
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		
	}

}
