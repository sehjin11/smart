package pk01;

import java.util.Scanner;

public class Ex02test {

	public static void main(String[] args) {

		Ex01 ex=new Ex01();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("시작할 단을 입력하세요 : ");
		int dan1=sc.nextInt();
		System.out.println("마지막 단을 입력하세요 : ");
		int dan2=sc.nextInt();
		System.out.println("시작할 곱을 입력하세요 : ");
		int dan3=sc.nextInt();
		System.out.println("마지막 곱을 입력하세요 : ");
		int dan4=sc.nextInt();
		
		ex.gugu(dan1, dan2, dan3, dan4);
		
		sc.close();
	}

}
