package pk01;

public class Ex02test {

	public static void main(String[] args) {

		Ex02 ex1=new Ex02("opabina1");
		Ex02 ex2=new Ex02("opabina2");
		Ex02 ex3=new Ex02("opabina3");

		Ex04 ex4=new Ex04();
		ex4.setUserId("박정후");
		
		Ex04 ex5=new Ex04();
		ex5.setUserId("박세진");
		
		ex1.equals(ex3);
		ex4.equals(ex5);
		ex1.equals(ex4);
		ex4.equals(ex2);
	}

}
