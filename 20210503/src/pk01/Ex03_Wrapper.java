package pk01;

public class Ex03_Wrapper {

	public static void main(String[] args) {

		//byte, char, short, int, long, float, double,
		//boolean �ڷ��� ����
		
		//������ ���ڷ� ��ȯ�ϱ�
		
		int i = 10;
		String str= String.valueOf(i);
		System.out.println(str);
		
		//���ڿ��� �⺻ �ڷ������� ��ȯ
		
		int k=Integer.valueOf(str);
		System.out.println(k-1);
		
		Integer i2= 100; 	//�ڽ�
		int i3=i;		 	//��ڽ�
		
		// i3 = null; �� �� x
		i2 = null;
		System.out.println(i2);
		//Wrapper �ڷ����� null���� �����ϱ� ���ؼ� ����Ѵ�.
		//���ڿ��� �⺻ �ڷ������� ��ȯ�ϱ� ���ؼ� ���.
		
	}

}
