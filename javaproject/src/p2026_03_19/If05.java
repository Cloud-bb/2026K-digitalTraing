package p2026_03_19;

public class If05 {

	public static void main(String[] args) {
		//난수발생
		//0.0 <= Math.random() < 1.0
		//1                        6
		
		//난수발생 공식
		//난수 (정수화)(Math.random()*(상한값-하한값+1))+하한값
		//로또번호 (1~45): (int)(Math.random() * 45) + 1
		System.out.println(Math.random());
		
		//주사위 번호 뽑기 : 1~6
		int num = (int)(Math.random()*6) + 1;
		System.out.println("num="+num);
		if(num==1) {
			System.out.println("1번");
		}else if(num==2) {
			System.out.println("2번");
		}else if(num==3) {
			System.out.println("3번");
		}else if(num==4) {
			System.out.println("4번");
		}else if(num==5) {
			System.out.println("5번");
		}else if(num==6) {
			System.out.println("6번");
		}
		int r = (int)(Math.random()*45)+1;
		System.out.println("로또당첨="+r);
	}

}
