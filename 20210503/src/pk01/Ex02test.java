package pk01;

import java.util.Scanner;

public class Ex02test {

	public static void main(String[] args) {

		Ex01 ex=new Ex01();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("������ ���� �Է��ϼ��� : ");
		int dan1=sc.nextInt();
		System.out.println("������ ���� �Է��ϼ��� : ");
		int dan2=sc.nextInt();
		System.out.println("������ ���� �Է��ϼ��� : ");
		int dan3=sc.nextInt();
		System.out.println("������ ���� �Է��ϼ��� : ");
		int dan4=sc.nextInt();
		
		ex.gugu(dan1, dan2, dan3, dan4);
		
		sc.close();
	}

}
