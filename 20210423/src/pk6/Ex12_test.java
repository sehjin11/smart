package pk6;

public class Ex12_test {

	public static void main(String[] args) {
	
			//interface �͸� ��ü�� �̿��� ���� ����
			//������ �����Ҷ����� �������Ѵ�
			Ex12 ex=new Ex12(){

			@Override
			public void add(int num1, int num2) {
				System.out.println(num1+num2);
			}

			@Override
			public void sub(int num1, int num2) {
				System.out.println(num1-num2);
			}

			@Override
			public void mul(int num1, int num2) {
				System.out.println(num1*num2);
			}

			@Override
			public void div(int num1, int num2) {
				System.out.println(num1/num2);
			}
			
		};
		
		
		ex.add(4, 78);
		ex.sub(6, 3);
		ex.mul(7, 456);
		ex.div(564, 34);
		
		
		//interface ��ӹ��� Ŭ������ �����ؼ� ���� ����
		//��ӹ��� Ŭ������ �̿��� ���� ��� ���� ����
		Ex13 ex1=new Ex13();
		
		ex1.add(4, 78);
				
	}

}
