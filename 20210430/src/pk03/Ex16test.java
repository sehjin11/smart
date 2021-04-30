package pk03;

public class Ex16test {

	public static void main(String[] args) {

		String ssn="881212-1234567";
		//			0123456789...
		
		String cut=ssn.substring(0,6);	//n번째부터 n개 문자열 추출
		System.out.println(cut);
		System.out.println(cut+"-*******");
		int idx=ssn.indexOf("-");
		System.out.println(idx);
		
		System.out.println(ssn.substring(0,idx));
		System.out.println(ssn.substring(idx+1));	//idx+1번부터 다가져와라
		System.out.println(ssn.substring(idx-4,idx));	//idx+1번부터 다가져와라

	
		
		//숫자 3부터 4글자 추출하기
		String str="123456789";
		
		//숫자 3찾기
		idx=str.indexOf("3");
		System.out.println("3의 index : "+idx);
		
		System.out.println(str.substring(idx,idx+4));
	}

}
