package p2026_03_24;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] scores; //배열 선언 : 배열의 주소값을 가지지않은 상태
		scores = new int[] {83,90,87};
		
//		int[] scores = new int[] {83,90,87};
		int sum1 =0;
		for (int i = 0;i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:"+sum1);
		
		int[] s = new int[] {83,90,87};
		int sum2 = add(s);
		System.out.println("총합:"+sum2);
	}
	
	
//	사용자 정의 메소드
	public static int add(int[]scores) {
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum+= scores[i];
		}
		return sum; //return문 : 메소드를 호출한 곳에 값을 돌려주는 역할 
	}

}
