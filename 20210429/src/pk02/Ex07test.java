package pk02;

import java.util.HashMap;

public class Ex07test {

	public static void main(String[] args) {

		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "박세진");
		System.out.println(map.get(1));
		
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		
		map1.put("1", 10);
		System.out.println(map1.get("1"));
		
		
		HashMap<String, Ex06> map2=new HashMap<String, Ex06>();
		Ex06 ex= new Ex06("냉장고", 10000);
		map2.put(Integer.toString(Ex06.idx), ex);
		
		ex=new Ex06("에어컨", 20000);
		map2.put(Integer.toString(Ex06.idx), ex);
		
		System.out.println(map2.get("1").getGoodsName());
		System.out.println(map2.get("2").getGoodsName());
		
	}

}
