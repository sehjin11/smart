package pk03;

public class Ex20_test {

	public static void main(String[] args) {

		String url = "https://news.naver.com/main/read.nhn";
		String contextPath = "/main";
		//�� ���ڿ����� url���� �𸥴�. /main ���� ���ڿ��� ����Ͻÿ�.
		
		int idx=url.indexOf(contextPath);
		System.out.println(idx);
		
		String context=url.substring(idx+5);
		System.out.println(context);
		
		
		System.out.println(url.substring(url.indexOf(contextPath)+contextPath.length()));
	}
}