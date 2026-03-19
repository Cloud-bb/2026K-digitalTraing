package p2026_03_19;

import java.util.Scanner;

public class Oper06 {

//	키보드로 입력한 정수 2개 중에서 최대값과 최소값을 출력하는 프로그램을 작성하시오 (if문 활용)
	public static void main(String[] args) {
		
		int n1,n2,max,min;
		
		System.out.println("정수 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		System.out.println("max="+ max);
		System.out.println("min="+ min
				);
		

	}

}
