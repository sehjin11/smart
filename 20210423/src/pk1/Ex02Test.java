package pk1;

public class Ex02Test {

	public static void main(String[] args) {

		Ex02_ ex= new Ex02_();//�ڽ�Ŭ���� ��ü ����
		
		ex.method1();//�θ�Ŭ�����κ��� ��ӹ��� �޼���
		ex.method2();
		ex.method3();//�ڱ�Ŭ������ �޼���
		
		ex.field1="�θ� �ʵ�";
		System.out.println(ex.field1);//�θ�Ŭ�����κ��� ��ӹ��� �ʵ�
		ex.field2="�ڽ� �ʵ�";
		System.out.println(ex.field2);//�ڱ� �ʵ�
		
	}

}
