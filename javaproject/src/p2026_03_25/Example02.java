package p2026_03_25;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				score = new int[studentNum];
			} else if (selectNo == 2) {

				if (score == null) {
					System.out.println("학생 수를 먼저 입력하시오");
				} else {
					for (int i = 0; i < score.length; i++) {
						System.out.println("score[" + i + "]>");
						score[i] = Integer.parseInt(scanner.nextLine());
					}
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "]>" + score[i]);
				}
			} else if (selectNo == 4) {
				// 최대값 구하기
				int max = 0, sum = 0;
				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					if (max < score[i])
						max = score[i];
				}
				// 평균 구하기
				double avg = 0;
				avg = (double) sum / studentNum;
				System.out.println("최고점수:" + max);
				System.out.println("평균:" + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}