package pk1;

import java.util.HashMap;
import java.util.Iterator;


public class Ex01 {
	public static void main(String[] args) {
	//데이터를 저장하는 방식으로
	//1.기본 자료형을 이용한 변수
	//2.같은 자료형을 여러개 저장할 수 있는 배열
	//3.다른 유형의 데이터를 저장할 수 있는 class(참조형)
	//4.class 배열
	//	
	//배열의 단점은 선언 시 배열의 크기를 정해야 한다.
	//ex) int i [] = new int [3];  3이라는 크기를 정해야한다.
	//	
	//크기가 정해져 있지 않은 배열 같은 저장공간을 만들고 싶다(확장성)
	//크기가 변경 가능한 자료형 : Map
		HashMap<Integer, String> map=
				new HashMap<Integer, String>();
		
		map.put(1, "이숭무");		//.put 초기화(값 입력)
		map.put(2, "박세진");
		map.put(3, "이찬규");
		map.put(4, "도성민");
		map.put(5, "주은혜");
		map.put(6, "임규선");
		map.put(6, "김창준");
		
		System.out.println(map.get(6));		//.get 저장값 호출
		System.out.println(map.size());		//.size 방 갯수
		
//		for(int i=0;i<=100;i++) {
//			map.put(i,"가나다라");
//		}
//		
//		System.out.println(map.get(6));		//.get 저장값 호출
		
		
		Iterator<Integer> keys = map.keySet().iterator();
		//.keyset() 은 key값만 추출
		//Iterator에 저장
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key));
		}
		
	}
}
