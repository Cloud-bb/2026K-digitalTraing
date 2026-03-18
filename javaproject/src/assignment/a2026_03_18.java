package assignment;

import java.util.Scanner;

public class a2026_03_18 {

	public static void main(String[] args) {
		//키보드로 3개의 정수를 입력받았을 때, 
		//최대값과 최소값을 구하는 프로그램을 작성하시오(단, 조건 연산자를 활용하시오)
		
		int num1,num2,num3,max,min;
		System.out.println("정수 3개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		num1= sc.nextInt();
		num2= sc.nextInt();
		num3= sc.nextInt();
		
		//최댓값
		max = num1>num2 ? num1 : num2;
		max = max >num3 ? max : num3;
		
		//최소값
		min = num1<num2 ? num1 : num2;
		min = min<num3 ? min : num3;
		
		System.out.println("최대값은"+max+" 최소값은 "+min+"입니다.");
	}

}
