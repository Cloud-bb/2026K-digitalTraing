package p2026_03_23;

public class Reference {

	public static void main(String[] args) {

		//기본 자료형변수
		//지역변수는 stack메모리 영역에 저장된다.
		int age = 25;
		double price =100.5;
		
		System.out.println("age:"+age);
		System.out.println("price:"+price);
		
		int sum = 0;
		for(int i = 1;i<=10; i++) {
			sum+=i;
		}
//		i는 지역변수이기 때문에 for 문 안에서만 사용가능하다
//		System.out.println(i); 
		System.out.println("sum="+sum);
		
//		참조형:클래스
		String str1 = "자바";
		String str2 = new String("자바");
		
		if(str1.equals(str2)) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//		참조형 : 배열
		int[] score = new int[3];
//		int[] score= {80,90,100};
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
	}
}


