package p2026_03_20;

public class Break02 {

	public static void main(String[] args) {
		
		// 무한루프 : while문 while(true)
		// break : 반복문을 빠져 나오는 역할
		
		int i=1;
		while(true) {
			System.out.println(i+"무한출력");
			if(i==100) break;
			i++;
		}

	}

}
