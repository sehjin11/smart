package pk1;

public class Ex02Test {

	public static void main(String[] args) {

		Ex02_ ex= new Ex02_();//자식클래스 객체 생성
		
		ex.method1();//부모클래스로부터 상속받은 메서드
		ex.method2();
		ex.method3();//자기클래스의 메서드
		
		ex.field1="부모 필드";
		System.out.println(ex.field1);//부모클래스로부터 상속받은 필드
		ex.field2="자식 필드";
		System.out.println(ex.field2);//자기 필드
		
	}

}
