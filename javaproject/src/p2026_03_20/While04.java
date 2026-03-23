package p2026_03_20;

public class While04 {

	public static void main(String[] args) {
		
		// while문을 이용해서 구구단(2~9단)을 출력하는 프로그램을 작성 하세요?
		
		int dan=2, i;			// 초기값
		while(dan <= 9) {		// 조건식 : 단(기준)
			System.out.println("["+dan+"단]");
			
			i=1;
			while(i <= 9) {		// 조건식
				System.out.println(dan+"*"+i+"="+ dan*i);
				i++;			// 증감식
			}
			dan++;				// 증감식
			System.out.println();  // 각단 줄간격 벌리기
		}

	}

}
