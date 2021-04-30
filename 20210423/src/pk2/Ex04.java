package pk2;

public class Ex04 extends Ex03{

	//자식클래스에서 부모클래스의 메서드를 오버라이딩(재정의)함으로써
	//동일한 메서드 명으로 자식클래스 별로 작업을 수행할 수 있다
	@Override
	public void add(){
		System.out.println(num2-num1);
	}
	@Override
	public void sub() {
		System.out.println(num2-num1);
	}
	public void mul() {
		System.out.println(num2*num1);
	}
	public void div() {
		System.out.println(num2/num1);
	}
}
