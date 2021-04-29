package pk02;

import java.util.HashMap;

public class Ex05Test {

	public static void main(String[] args) {

		HashMap<Integer, String> map=
				new HashMap<Integer, String>();
		
		map.put(1, "박세진");
		map.put(2, "조인성");
		map.put(3, "홍인철");
		System.out.println(map.get(1));
		
		HashMap<Double, Integer> map1=new HashMap<Double, Integer>();
		
		map1.put(1.0, 3);
		map1.put(2.0, 7);
		System.out.println(map1.get(1.0));	 	//map1의 1.0에 저장된 값을 출력
		String str=map1.get(1.0).toString();	//map1의 1.0에 저장된 값을 String으로 전환
		System.out.println(str);
		
		
		HashMap<Integer, Ex03> map2= new HashMap<Integer, Ex03>();
		
		Ex03 ex=new Ex03("sehjin11@gmail.com", "박세진");
		map2.put(ex.idx1, ex);
		System.out.println(map2.get(0
				).getEmail());
		
	}

}
