package p2026_03_20;

public class For02 {

	public static void main(String[] args) {
	// 1 ~ 10까지 합을 구하는 프로그램을 작성 하세요?
		
		int sum = 0;				// sum : 지역변수(local variable)
		for(int i=1; i<=10; i++) {	// i : 지역변수
			sum = sum + i;			// sum += i;
//			 1  =  0  + 1
//			 3  =  1  + 2
//			 6  =  3  + 3
//			10  =  6  + 4
//			15  = 10  + 5
			
			System.out.println("1~"+i+"="+sum);
		}
		// i는 지역변수이기 때문에 for문 안에서만 사용 가능하다.
//		System.out.println(i);     // 에러발생
		System.out.println("sum="+ sum);
	}

}
