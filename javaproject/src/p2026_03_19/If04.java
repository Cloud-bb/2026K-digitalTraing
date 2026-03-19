package p2026_03_19;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
//		키보드가 입력한 점수가 어느 학점에 해당되는지 판별하는 프로그램
		
		 System.out.println("0~100사의 점수를 입력하세요");
		 Scanner sc = new Scanner(System.in);
		 int s= sc.nextInt();
		//1.if else if문은 조건절이 2개 이상 필요한 경우에 사용한다
		//2.if else if문은 가장 먼저 만족하는 조건절 아랫쪽의 문장을 실행하고 빠져나온다
		//3.if else if문에서 위의 조건식을 만족하지 않을때는 else 아랫쪽의 문장을 실행한다 
		 if(s>=90) {
			 System.out.println("A학점");
		 }else if(s>=80){
			 System.out.println("B학점");
		 }else if(s>=70){
				System.out.println("c학점");
		 }else if(s>=60){
				System.out.println("d학점");
		 }else {
			 System.out.println("F학점");
		 }
				 
	}

}
