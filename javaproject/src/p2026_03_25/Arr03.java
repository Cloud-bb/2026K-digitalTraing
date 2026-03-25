package p2026_03_25;

public class Arr03 {

	public static void main(String[] args) {
		//2차원 배열
		
		//정수를 저장하는 5행 3열 구조의 기억 공간을 생성
		int[][] score = new int[5][3];
		//5명 학생의 국어,영어, 수학 점수를 2차원 배열에 저장
		//행(row):학생번호(1~5번 학생)
		//열(column) :과목(국어,영어,수학)
		
		score[0][0]=85; score[0][1]=60; score[0][2]=70;
		score[1][0]=90; score[1][1]=95; score[1][2]=80;
		score[2][0]=75; score[2][1]=80; score[2][2]=100;
		score[3][0]=80; score[3][1]=70; score[3][2]=95;
		score[4][0]=100;score[4][1]=65; score[4][2]=80;
		
		//중첩 for문으로 5명 학생의 국어, 영어, 수학 점수를 출력
		for(int row=0; row<5;row++) {	//학생번호 : 1~5번
			for(int col=0;col<3;col++) { 	//과목 : 국어, 영어, 수학
				System.out.print(score[row][col]+"\t");
			}
			System.out.println();
		}
	}

	
}
