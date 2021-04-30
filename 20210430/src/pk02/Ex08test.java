package pk02;

public class Ex08test {

	public static void main(String[] args) {

		Ex06 ex1=new Ex06("세진주식회사", "Windows");
		Ex06 ex2=new Ex06("SJcoms", "Linux");
		Ex07 ex3=new Ex07();
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 클래스로 만들어진 객체");
		}
		else {
			System.out.println("다른 클래스로 만든 객체");
		}
		
		if(ex1.equals(ex3)) {
			System.out.println("같은 클래스로 만들어진 객체");
		}
		else {
			System.out.println("다른 클래스로 만든 객체");
		}
		
		String str=ex1.toString();
		System.out.println(str);
		
		str=ex2.toString();
		System.out.println(str);
	}

}
