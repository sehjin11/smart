package pk02;

public class Ex10test {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		int sum=0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		System.out.println("1~1000000������ �� = "+sum);
		
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("���� �ð��� "+ (endTime-startTime)+"/1000�� �ɷȽ��ϴ�.");

		
		
		startTime = System.nanoTime();
		
		sum=0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		System.out.println("1~1000000������ �� = "+sum);
		
		
		endTime = System.nanoTime();
		
		System.out.println("���� �ð��� "+ (endTime-startTime)+"������ �ɷȽ��ϴ�.");
		
	}
}
