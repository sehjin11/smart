package pk03;

public class Ex20_test {

	public static void main(String[] args) {

		String url = "https://news.naver.com/main/read.nhn";
		String contextPath = "/main";
		//위 문자열에서 url값을 모른다. /main 뒤의 문자열을 출력하시오.
		
		int idx=url.indexOf(contextPath);
		System.out.println(idx);
		
		String context=url.substring(idx+5);
		System.out.println(context);
		
		
		System.out.println(url.substring(url.indexOf(contextPath)+contextPath.length()));
	}
}