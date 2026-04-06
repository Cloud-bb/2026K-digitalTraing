package assignment;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class a2026_04_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();
		GregorianCalendar c = new GregorianCalendar();// 레퍼런스 형변환 (업캐스팅,자동형변환)

		if (c.isLeapYear(year)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다");
		}

	}

}
