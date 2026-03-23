package p2026_03_20;

public class DoWhile02 {

	public static void main(String[] args) {
//		do~while문으로 1~100까지 홀수 , 짝수의 합을 구하시오
		int i=1, even=0, odd=0;
		do {
			if(i%2==0) {
				even+=i;
				
			}else {
				odd+=i;
			}
			i++;
		}while(i<=100);
		System.out.println("짝수의 합"+even);
		System.out.println("홀수의 합"+odd);
	}

}

