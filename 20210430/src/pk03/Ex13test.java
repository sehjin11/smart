package pk03;

public class Ex13test {
	public static void main(String [] args) {
		
		
		String subject="자바 프로그래밍";
		
		char ch=subject.charAt(5);
		System.out.println(ch);
		//n번째 문자 추출(0,1,2,3,4,5..)
		//스페이스도 문자로 취급
		
		int idx=subject.indexOf('프');
		System.out.println(idx);
		//해당 문자가 몇번째인지
		
		idx=subject.indexOf("그래밍");
		System.out.println(idx);
		//해당 문자열의 첫번째 문자 몇번째

		idx=subject.indexOf("박세진");
		System.out.println(idx);
		//해당 문자(문자열)없으면 -1
		
		if(subject.indexOf("이유진")!=-1) {
			System.out.println("이유진이 있습니다.");
		}else {
			System.out.println("이유진이 없습니다.");
		}
		
		int count = subject.length();
		System.out.println(count);
		
		subject="가나다라 마바사 아자차카타 파하";
		count=subject.length();
		System.out.println(count);
	}
	
}
