
public class Ex06 {

	public static void main(String[] args) {
		int i=-127;
		int j=-i;
		System.out.println(j);
		short s = -10;
		int s1 = -s;//부호도 연산이므로 4byte로 받아야한다
		System.out.println(s1);
		
		int m = 10;
		int k = 20;
		
		double result1= (double)m/k;
		System.out.println(result1);

	}

}
