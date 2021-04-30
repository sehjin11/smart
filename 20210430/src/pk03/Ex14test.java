package pk03;

import java.io.UnsupportedEncodingException;

public class Ex14test {

	public static void main(String[] args) {

		String str="안녕하세요";
		byte[] bytes1=str.getBytes();//문자열을 바이트정보로 전환
		System.out.println(bytes1[0]);
		System.out.println(bytes1.length);//1글자가 몇바이트인지 알 수 있다.
		
		str=new String(bytes1);
		System.out.println(str);
		
		try {
			bytes1=str.getBytes("EUC-KR");
			System.out.println("EUC-KR의 크기 : "+bytes1.length);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
