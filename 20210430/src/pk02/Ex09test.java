package pk02;

import java.util.Scanner;

public class Ex09test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.nanoTime();
		System.out.println("������ ���α׷� ����Ǿ����ϴ�.");
		
		while(true){
			
			System.out.println("�����Ͻ÷��� exit�� �Է��ϼ���.");
			System.out.print("�� ���� ����Ͻðڽ��ϱ�? : ");
			String data1=sc.next();
		if(data1.equals("exit")) {
			
			System.out.println("======================");
			System.out.println("���α׷��� �����Ͽ����ϴ�.");
			sc.close();
			break;// �ݺ����� ����
			//System.exit(0); //��ü ����
		}
		else {
		int dan=Integer.parseInt(data1);
		System.out.println("======================");
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
		System.out.println("======================");
		}
		}
		System.gc();	//������ ��ü ����. �ڵ����� ���ش�
		System.out.println("�ݺ����� ����Ǿ����ϴ�.");
	}

}
