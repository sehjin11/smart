package pk03;

public class Ex16test {

	public static void main(String[] args) {

		String ssn="881212-1234567";
		//			0123456789...
		
		String cut=ssn.substring(0,6);	//n��°���� n�� ���ڿ� ����
		System.out.println(cut);
		System.out.println(cut+"-*******");
		int idx=ssn.indexOf("-");
		System.out.println(idx);
		
		System.out.println(ssn.substring(0,idx));
		System.out.println(ssn.substring(idx+1));	//idx+1������ �ٰ����Ͷ�
		System.out.println(ssn.substring(idx-4,idx));	//idx+1������ �ٰ����Ͷ�

	
		
		//���� 3���� 4���� �����ϱ�
		String str="123456789";
		
		//���� 3ã��
		idx=str.indexOf("3");
		System.out.println("3�� index : "+idx);
		
		System.out.println(str.substring(idx,idx+4));
	}

}
