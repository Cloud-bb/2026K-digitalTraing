package p2026_03_25;

public class Arr04 {

	public static void main(String[] args) {
		
		int [][]score = {
				{85   , 60, 70},
				{90, 95, 80},
				{75, 80, 100},
				{80, 70, 95},
				{100, 65, 80}
		};
		int [] subject = new int[3];
		int [] student = new int[5];
		
		System.out.println("각 과목별 총점 구하기");
		for(int c =0;c<3;c++) {
			for(int r = 0;r<5;r++) {
				subject[c]+=score[r][c];
			}
			System.out.print(subject[c]+"\t");
		}
		System.out.println();
		
		
		System.out.println("학생별 총점 구하기");
		for(int r= 0;r<5;r++) {
			for(int c=0;c<3;c++) {
				student[r]+=score[r][c];
			}
			System.out.print(student[r]+"\t");
		}
		
	}

}
