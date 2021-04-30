package pk02;

import java.util.Scanner;

public class Ex09test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.nanoTime();
		System.out.println("구구단 프로그램 실행되었습니다.");
		
		while(true){
			
			System.out.println("종료하시려면 exit를 입력하세요.");
			System.out.print("몇 단을 출력하시겠습니까? : ");
			String data1=sc.next();
		if(data1.equals("exit")) {
			
			System.out.println("======================");
			System.out.println("프로그램을 종료하였습니다.");
			sc.close();
			break;// 반복문만 종료
			//System.exit(0); //전체 종료
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
		System.gc();	//쓰레기 객체 제거. 자동으로 해준다
		System.out.println("반복문이 종료되었습니다.");
	}

}
