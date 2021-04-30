package pk1;

public class Ex02Test2 {

	public static void main(String[] args) {

		Ex02 ex=new Ex02_(); //변수는 부모클래스, 객체는 자식클래스
		ex.field1="부모 필드";
		System.out.println(ex.field1);
		ex.method1();
		ex.method2();
		//부모클래스에 있는 멤버필드, 메서드만 사용 가능
		//ex.method3(); 호출x
		
		//자식클래스를 자동형변환 하여 쓰는 이유는
		//자식클래스의 오버라이드를 통해 다향화
		
		//Ex02_  ex1= ex; //자식 클래스를 부모 클래스로 대입할 수 x
		Ex02_ ex1=(Ex02_)ex;
		//자식클래스 새로운변수 = (자식클래스)부모클래스변수
		//강제 형변환
		
		ex1.field2="자식클래스";
		System.out.println(ex1.field2);
		ex1.method3();
		//강제 형변환 후 자식클래스에 있는 멤버필드와 메서드 호출 가능
		
		Ex02 ex2=new Ex02_();
		Ex02_ ex2_1=(Ex02_)ex2;
		//강제 형변환을 하려면 2번의 과정을 거쳐야..
		
	}

}
