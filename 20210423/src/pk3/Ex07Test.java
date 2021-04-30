package pk3;

public class Ex07Test {

	public static void main(String[] args) {

		//Ex06 ex=new Ex06(); abstract class로 지정되면 객체생성 못함
		
		Ex07 ex=new Ex07();
		
		ex.num1=20;
		ex.num2=10;
		
		ex.add();
		ex.sub();
		ex.mul();
		ex.div();
		
	}

}
