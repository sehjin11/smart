package pk3;

public abstract class Ex06 {

	int num1;
	int num2;
	public abstract void add();	//정의가 되지 않은 메서드 : 추상 메서드
	public abstract void sub();
	public abstract void mul();
	public void div() {
		System.out.println(num1/num2);
	};

	
}
