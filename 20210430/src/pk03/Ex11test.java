package pk03;

public class Ex11test {

	public static void main(String[] args) {

		String ssn="201135-1111110";
		//index�� �ش�Ǵ� ���� ����
		
		char ch=ssn.charAt(7);
		//���ڿ����� 7��° ���� ����
		
		System.out.println(ch);
		switch(ch) {
		case '1' :
			break;
		case '3' :
			break;
		case '7' :
			break;
		case '9' :	System.out.println("�����Դϴ�.");
		break;
		case '6' :
			break;
		case '5' :
			break;
		case '0' :	System.out.println("�����Դϴ�.");
		break;
		}
	}

}
