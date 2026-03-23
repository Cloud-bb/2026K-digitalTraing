package p2026_03_20;

public class For06 {

	public static void main(String[] args) {
		
		// 구구단(2~9단)을 출력하는 프로그램을 작성 하세요?
		// 중첩 for문
		for(int dan=2; dan<=9; dan++) {			// 단(기준)
			
			System.out.println("["+dan+"단]");   // 단 title
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
			System.out.println();   // 각 단 줄간격 벌리기
		}

	}

}
