package pk03;

public class Ex12Test {

	public static void main(String [] args) {
		
		String name="�ڼ���";
		String name1=new String("�ڼ���");
		String name2="�ڼ���";
		
		if(name==name2) {
			System.out.println("��ü�� �ּҰ� �����ϴ�.");
		}else {
			System.out.println("��ü�� �ּҰ� �ٸ��ϴ�.");
		}
		
		if(name==name1) {
			System.out.println("��ü�� �ּҰ� �����ϴ�.");
		}else {
			System.out.println("��ü�� �ּҰ� �ٸ��ϴ�.");
		}
		
		
		
		if(name.equals(name2)) {
			System.out.println("��ü�� ���� �����ϴ�.");
		}
		else {
			System.out.println("��ü�� ���� �ٸ��ϴ�.");
		}
	}
}
