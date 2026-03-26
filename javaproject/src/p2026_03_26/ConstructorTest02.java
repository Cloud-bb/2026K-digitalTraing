package p2026_03_26;

class MyDate{   
	// 외부 클래스의 접근을 허용하지 않는 
  private int year;    
  private int month;    
  private int day;

  //생성자는 클래스로 객체를 생성할 때 호출된다--중요
  public  MyDate(){
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
  }  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest02 {     
  public static void main(String[] args) {
    MyDate d =  new MyDate();	
    d.print();
//	System.out.println(d.year);
//	MyDate dd =  new MyDate();
 }
} 