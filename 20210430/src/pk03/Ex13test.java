package pk03;

public class Ex13test {
	public static void main(String [] args) {
		
		
		String subject="�ڹ� ���α׷���";
		
		char ch=subject.charAt(5);
		System.out.println(ch);
		//n��° ���� ����(0,1,2,3,4,5..)
		//�����̽��� ���ڷ� ���
		
		int idx=subject.indexOf('��');
		System.out.println(idx);
		//�ش� ���ڰ� ���°����
		
		idx=subject.indexOf("�׷���");
		System.out.println(idx);
		//�ش� ���ڿ��� ù��° ���� ���°

		idx=subject.indexOf("�ڼ���");
		System.out.println(idx);
		//�ش� ����(���ڿ�)������ -1
		
		if(subject.indexOf("������")!=-1) {
			System.out.println("�������� �ֽ��ϴ�.");
		}else {
			System.out.println("�������� �����ϴ�.");
		}
		
		int count = subject.length();
		System.out.println(count);
		
		subject="�����ٶ� ���ٻ� ������īŸ ����";
		count=subject.length();
		System.out.println(count);
	}
	
}
