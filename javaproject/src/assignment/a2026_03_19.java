package assignment;

import java.util.Scanner;

public class a2026_03_19 {

	public static void main(String[] args) {
		//키보드로 정수 3개를 입력받았을 떄 최대값과 최소값을 구하시오
		//if else구문으로 작성
		int n1,n2,n3,max,min;
		System.out.println("정수 3개를 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
//		최대값
		if(n1>n2 && n1>n3) {
			max=n1;
		}else if(n2>n3) {
			max=n2;
		}else {
			max=n3;
		}
		
//		최소값
		if(n1<n2 && n1<n3) {
			min=n1;
		}else if(n2<n3) {
			min=n2;
		}else {
			min=n3;
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
