package p2026_03_19;

import java.util.Scanner;

public class Oper07 {

	public static void main(String[] args) {
		int a,b,c,d,e,total,avg;
		System.out.println("5과목의 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
//		1. int형과 int 형을 산술연산하면 int형으로 처리된다
//		2. int와 double 형을 산술연산하면 더 큰 자료형인 double로 처리된다
		total = a + b + c + d + e;
		avg = (a+b+c+d+e) / 5;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		if(a>40&&b>40&&c>40&&d>40&&e>40 && avg>=60){
			System.out.println("합격입니다");
			}else{
			System.out.println("불합격입니다");
		}
	}

}
