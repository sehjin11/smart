
public class OperationCasting {

	public static void main(String[] args) {

		short s = 10;
		int i2= 65537;
		int i3 = s+i2;
		System.out.println(i3);
		
		int i=10;
		double d = 170.5;
		double d1= i+d;
		System.out.println(d1);
		int i1=(int)d+i;
		System.out.println(i1);
		
		System.out.println(10+20); //정수는 4바이트로 연산 (4byte+4byte)
		
		byte b=10;
		byte b1=20;
		//byte b2=b+b1; 은 에러. 정수의 연산은 4바이트여야 하므로 byte로 받을 수 없다.
		int i4=b+b1;
		System.out.println(i4);
		
		byte a=127;
		byte aa=2;
		int c=a+aa;
		byte dd=(byte)c;
		System.out.println(c);
		System.out.println(dd);
	

	}

}
