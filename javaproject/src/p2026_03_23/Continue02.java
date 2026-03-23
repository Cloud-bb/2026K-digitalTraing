package p2026_03_23;

public class Continue02 {

	public static void main(String[] args) {
//		continue 문을 사용해서 1~100까지 정수중에서 짝수만 출력하는 프로그램을 작성하시오
		
		for(int i=1;i<=100;i++) {
			if(i%2==1) continue;
			System.out.println(i);
		}
	}

}
