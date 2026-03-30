package assignment;

import java.util.Arrays;

public class a2026_03_30 {
//1~45사이의 숫자를 6개 추출하는 프로그램을 작성하시오 (단, 중복된 숫자는 1번만 출력되도록한다) 
	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			// 중복검사
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
		}
		
		// 배열 정렬
		Arrays.sort(lotto);
		
		// 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}

}
