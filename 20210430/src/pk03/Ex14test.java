package pk03;

import java.io.UnsupportedEncodingException;

public class Ex14test {

	public static void main(String[] args) {

		String str="�ȳ��ϼ���";
		byte[] bytes1=str.getBytes();//���ڿ��� ����Ʈ������ ��ȯ
		System.out.println(bytes1[0]);
		System.out.println(bytes1.length);//1���ڰ� �����Ʈ���� �� �� �ִ�.
		
		str=new String(bytes1);
		System.out.println(str);
		
		try {
			bytes1=str.getBytes("EUC-KR");
			System.out.println("EUC-KR�� ũ�� : "+bytes1.length);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
