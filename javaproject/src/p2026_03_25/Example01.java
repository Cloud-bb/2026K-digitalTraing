package p2026_03_25;

public class Example01 {

	public static void main(String[] args) {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		double avg = 0.0;
		
//		작성위치
		int count=0;
		for(int r =0;r<array.length;r++) {
			for(int c=0;c<array[r].length;c++) {
				sum+=array[r][c];
				count+=1;
			}
		}
		avg=(double)sum/count;
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
	}

}
