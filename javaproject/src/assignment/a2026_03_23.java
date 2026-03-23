package assignment;

import java.util.Scanner;

public class a2026_03_23 {

	public static void main(String[] args) {
//		1. 키보드를 이용하여 정수 5개를 입력받은 후 , int 형 배열에 저장한다
//		이때 배열에 저장된 값 중에서 최대값과 최소값을 구하는 프로그램을 작성하시오
		
		int data[] = new int[5];
		int max,min;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하시오");
		
//		배열에 정수 저장
		for(int i=0;i<5;i++) {
		data[i] = sc.nextInt();
		}
		max=data[0];
		min=data[0];
		
//		최대 최소 도출
		for(int i=0;i<data.length;i++) {
//			디버깅을 위한 배열 출력
//			System.out.print(data[i]+"\t");
			if(data[i]>max) max=data[i];
			if(data[i]<min) min=data[i];
		}

		System.out.println("\nmax="+max);
		System.out.println("min="+min);
	}

}
