package p2026_03_25;

public class MethodEx02 {

//	1~n까지 합을 구하는 메소드
	public static int sum(int n) {
		int hap=0;
		for(int i =1;i<=n;i++) {
			hap+=i;
		}
//		System.out.println("1~"+n+"="+hap);
		return hap;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(3));
		System.out.println(sum(5));
		System.out.println(sum(10));
		System.out.println(sum(1000));
		System.out.println(sum(10000));
	}	
	

}
