package pk02;

public class Ex08test {

	public static void main(String[] args) {

		Ex06 ex1=new Ex06("�����ֽ�ȸ��", "Windows");
		Ex06 ex2=new Ex06("SJcoms", "Linux");
		Ex07 ex3=new Ex07();
		
		if(ex1.equals(ex2)) {
			System.out.println("���� Ŭ������ ������� ��ü");
		}
		else {
			System.out.println("�ٸ� Ŭ������ ���� ��ü");
		}
		
		if(ex1.equals(ex3)) {
			System.out.println("���� Ŭ������ ������� ��ü");
		}
		else {
			System.out.println("�ٸ� Ŭ������ ���� ��ü");
		}
		
		String str=ex1.toString();
		System.out.println(str);
		
		str=ex2.toString();
		System.out.println(str);
	}

}
