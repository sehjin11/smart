package pk1;

public class Ex02Test2 {

	public static void main(String[] args) {

		Ex02 ex=new Ex02_(); //������ �θ�Ŭ����, ��ü�� �ڽ�Ŭ����
		ex.field1="�θ� �ʵ�";
		System.out.println(ex.field1);
		ex.method1();
		ex.method2();
		//�θ�Ŭ������ �ִ� ����ʵ�, �޼��常 ��� ����
		//ex.method3(); ȣ��x
		
		//�ڽ�Ŭ������ �ڵ�����ȯ �Ͽ� ���� ������
		//�ڽ�Ŭ������ �������̵带 ���� ����ȭ
		
		//Ex02_  ex1= ex; //�ڽ� Ŭ������ �θ� Ŭ������ ������ �� x
		Ex02_ ex1=(Ex02_)ex;
		//�ڽ�Ŭ���� ���ο�� = (�ڽ�Ŭ����)�θ�Ŭ��������
		//���� ����ȯ
		
		ex1.field2="�ڽ�Ŭ����";
		System.out.println(ex1.field2);
		ex1.method3();
		//���� ����ȯ �� �ڽ�Ŭ������ �ִ� ����ʵ�� �޼��� ȣ�� ����
		
		Ex02 ex2=new Ex02_();
		Ex02_ ex2_1=(Ex02_)ex2;
		//���� ����ȯ�� �Ϸ��� 2���� ������ ���ľ�..
		
	}

}
