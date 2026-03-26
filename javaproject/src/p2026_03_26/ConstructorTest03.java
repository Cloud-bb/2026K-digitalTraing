package p2026_03_26;

class MyDate3{   
  private int year;    
  private int month;    
  private int day;

  public MyDate3(){ // 기본 생성자 
    year=2023;
    month=4;
    day=1;
  }  

  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate3 d=new MyDate3();
    d.print(); 
  }
}               