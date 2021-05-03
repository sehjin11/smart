package pk01;

public class Ex03_Wrapper {

	public static void main(String[] args) {

		//byte, char, short, int, long, float, double,
		//boolean 자료형 변수
		
		//정수를 문자로 변환하기
		
		int i = 10;
		String str= String.valueOf(i);
		System.out.println(str);
		
		//문자열을 기본 자료형으로 변환
		
		int k=Integer.valueOf(str);
		System.out.println(k-1);
		
		Integer i2= 100; 	//박싱
		int i3=i;		 	//언박싱
		
		// i3 = null; 할 수 x
		i2 = null;
		System.out.println(i2);
		//Wrapper 자료형은 null값을 저장하기 위해서 사용한다.
		//문자열을 기본 자료형으로 변환하기 위해서 사용.
		
	}

}
