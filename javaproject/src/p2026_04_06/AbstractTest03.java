package p2026_04_06;

abstract class Hello{			//부모 클래스 (추상 클래스)
  public abstract void sayHello(String name); //추상 메소드
}
abstract class GoodBye{			//부모 클래스 ( 추상 클래스)
  public abstract void sayGoodBye(String name);	//추상 메소드
}
// 클래스의 다중상속을 허용하지 않는다
class SubClass03 extends GoodBye , Hello{
  public void sayHello(String name){
      System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
      System.out.println(name+"씨 안녕히 가세요!");
  }
}
class AbstractTest03{
   public static void main(String[] args) {
     SubClass03 test= new SubClass03();
     test.sayHello("홍길동");
     test.sayGoodBye("홍길동");
   }   
}                                                       
