
public class Casting {

	public static void main(String[] args) {
	
		//강제 형변환
		long l = 10234344334L;
		int i= (int)l;
		System.out.println(i);//강제 형변환시 앞의 byte가 잘려나간다
		float f = 13.2f;
		int i2= (int)f;
		System.out.println(i2);
		// 실수를 정수로 강제형변환을 하면 정수값만 저장이 된다.

	}

}
