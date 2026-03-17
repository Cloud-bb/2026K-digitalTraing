package p2026_03_17;

import java.util.Date;
import java.util.Random;

public class First {
//접근제어자   사용자 정의 클래스 

	public static void main(String[] args) {
//메인 메소드 (파이썬은 함수라고 지칭_/ 자바 가상머신 (JBK.exe)이 가장 먼저 호출하는 메소드이다. 
//		1개의 클래스가 독립적으로 실행되기 위해서는 반드시 main 메소드가 필요하다

		System.out.println("자바 출력 성공");
		System.out.print("자바");
		System.out.print("오라클\n");
		
		Date d = new Date();
		System.out.println(d);
		
		Random r = new Random();
		System.out.println(r.nextInt(10));// 0 ~ 9 사이의 난수 발생 
	}

}
