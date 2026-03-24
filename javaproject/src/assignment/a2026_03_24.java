package assignment;

public class a2026_03_24 {

	public static void main(String[] args) {

		
		for(int dan=2; dan<=9; dan++) {				
			System.out.print("["+dan+"단]"+'\t');  
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {			
				System.out.print(dan+"*"+i+"="+dan*i+"\t"); 
			}
			System.out.println();
			
	}
		
//		향상된 for문과 배열 활용
		int dan[] = {2,3,4,5,6,7,8,9};
		for (int d:dan) {
			System.out.print("["+d+"단]"+'\t');
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int d : dan) {
				System.out.print(d+"*"+i+"="+d*i+'\t');
			}
			System.out.println();
			
		}
			
	
	}

}
