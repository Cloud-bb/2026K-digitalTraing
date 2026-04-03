package assignment;

import java.util.Scanner;

//키보드를 통해서 연도(ex) 2020)를 입력 받는다.
//이때 입력 받은 연도가 윤년인지 평년인지를 판별하는
//프로그램을 작성하세요?
public class a2026_04_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "년은 윤년입니다");
		} else {
			System.out.println(year + "년은 평년입니다");
		}

	}

}
