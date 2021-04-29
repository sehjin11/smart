
public class Promotion {

	public static void main(String[] args) {
		
		//자동 형변환: 작은 크기 데이터를 큰 공간에 저장할 때 발생
		byte a=10;
		int i = a;
		long l=i;
		System.out.println(l);
		float f=10.5f;
		double d = f;
		System.out.println(d);
		long l2=3989875023598989L;
		double d2=l2; //실수는 정수보다 크다. 지수는 실수형에만 저장 가능
		System.out.println(d2);
		// byte < short < int < long < float < double
		
		
	}

}
