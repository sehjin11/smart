package pk1;

import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {

		int [] i =new int[3];
		//배열은 선언할 때 크기를 설정해야한다. 나중에 늘릴 수도 없음.(제한)
		//HashMap은 크기를 정하지 않고 사용하고 원하는 만큼 저장할 수 있다(확장)
		
		HashMap<String, String> map = new HashMap<String, String>();
		//HashMap<key, value>
		
		map.put("high0","박세진");
		map.put("high1","박진영");
		map.put("high2","송중기");
		map.put("high3","은지수");
		map.put("high4","서예지");
		
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
