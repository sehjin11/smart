package pk03;

public class Ex18test {

	public static void main(String[] args) {

		String str1="Java Programming";
		String str2="JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1=str1.toLowerCase();	//���ڿ��� ��� �ҹ��ڷ� ������ִ� �޼��� .toLowerCase()
		String lowerStr2=str2.toLowerCase();
		
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		
		String upperStr1=str1.toUpperCase();
		String upperStr2=str2.toUpperCase();
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		String str3= " �ڼ��� ";
		if(str3.trim().equals("�ڼ���")) {
			System.out.println("��ġ");
		}else {
			System.out.println("����ġ");
		}
		//trim()�� �յ� ���� ����
		
		
		str3=" �ڼ��� ������ ��ġ ";
		System.out.println(str3.trim());
		//�߰� ������ ����x
		
		
		int i=10;
		double d = 10.5;
		boolean b=true;
		String i1="10";
		int result = Integer.parseInt(i1);
		System.out.println(result);
		
		String result1 = String.valueOf(i);
		System.out.println(result1);
		result1=String.valueOf(d);
		System.out.println(result1);
		result1=String.valueOf(b);
		System.out.println(result1);
		
		
		
	}

}
