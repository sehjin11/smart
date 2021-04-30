package pk03;

public class Ex11test {

	public static void main(String[] args) {

		String ssn="201135-1111110";
		//index에 해당되는 문자 추출
		
		char ch=ssn.charAt(7);
		//문자열에서 7번째 문자 추출
		
		System.out.println(ch);
		switch(ch) {
		case '1' :
			break;
		case '3' :
			break;
		case '7' :
			break;
		case '9' :	System.out.println("남자입니다.");
		break;
		case '6' :
			break;
		case '5' :
			break;
		case '0' :	System.out.println("여자입니다.");
		break;
		}
	}

}
