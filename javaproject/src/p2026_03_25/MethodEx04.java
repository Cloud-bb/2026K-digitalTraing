package p2026_03_25;

import java.util.Scanner;

public class MethodEx04 {

	public static void main(String[] args) {
		String s1 = "30";
		String s2 = "50";

		if (s1 == s2) {// 주소 비교
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		// boolean equals(object e) : 참조형 값을 비교할 떄 사용하는 메소드
		if (s1.equals(s2)) { // 값 비교
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		int max, min;

		System.out.println("int형 최대값:" + Integer.MAX_VALUE);
		// static int parseInt(String s): 문자를 숫자로 변환 해주는 메소드
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);

		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하시오");
		int age = sc.nextInt();
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		sc.nextLine(); // 이전에 입력된 개행문자(엔터키)를 처리해줘야함
		System.out.println("주소를 입력하시오");
		String address = sc.nextLine();

		System.out.println("나이:" + age);
		System.out.println("이름:" + name);
		System.out.println("주소:" + address);

	}

}
