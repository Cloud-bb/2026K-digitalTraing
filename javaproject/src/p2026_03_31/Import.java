package p2026_03_31;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
//java.util 패키지 안의 모든 클래스를 import 한다 
import java.util.* ; 

public class Import {

	public static void main(String[] args) {
		
		//java.lang 패키지 안에 있는 String 클래스는 import 를 생략할 수없다
		String str = new String ("자바");
		
		java.util.Date d1 = new java.util.Date();
		Date d2 = new Date();
		
//		Scanner sc = new Scanner(InputStream is);
//		Scanner sc2 = new Scanner(System.in);
//		int n = sc2.nextInt();
//		String s1 = sc2.next();
//		String s2 = sc2.nextLine();
//		----------------------------------------------------
//		 난수 발생 방법 : 1.Math.random()
//					   2.Random 클래스
		
		Random r = new Random();
		
		int n1 = r.nextInt(10);		//0~9
		
		System.out.println("n1="+n1);
		
//		주사위번호 1~6
		Random dice = new Random();
		int n2 = r.nextInt(6)+1;
		System.out.println("주사위번호="+n2);
		
		
//		로또 번호 : 1 ~ 45
		int n3 = r.nextInt(45)+1;
		System.out.println("로또 번호="+n3);
		
//		----------------------------------------------------
//		0.0 <= Math.random() < 1.0
		
		System.out.println("random()="+Math.random());

//		주사위번호
		int num = (int)(Math.random()*6)+1;
		System.out.println("주사위번호:"+num);
		
//		로또번호
		int num2 = (int)(Math.random()*45)+1;
		System.out.println("로또번호:"+num2
				);
	}

}
