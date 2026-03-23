package assignment;

import java.util.Scanner;

public class a2020_03_20 {

	public static void main(String[] args) {
//		키보드를 이용해서 입력한 정수의 팩토리얼을 구하는 프로그램을 작성하시오
		
		int f=1, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();
		
		for(i= num;i>=1;i--) {
			f= f * i;
		}
		System.out.println(num+"! = "+f);
	}
}
