package p2026_03_23;

public class Break03 {

	public static void main(String[] args) {
		
		int i=1;
		while(true) {
			i++;
			int num = (int)(Math.random() * 6)+1;
			System.out.println(num);
			
			if(num == 6) break; // 무한루프 빠져나옴
		}
		System.out.println("루프횟수: " + (i-1));
		System.out.println("프로그램 종료");
	}

}
