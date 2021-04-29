package pk02;

import java.util.HashMap;

public class Ex08test {

	public static void main(String[] args) {

		HashMap<Integer, Ex06> map=new HashMap<Integer, Ex06>();
		
		Ex06 ex=new Ex06("냉장고", 1000);
		map.put(Ex06.idx, ex);
		ex=new Ex06("에어컨",500);		
		map.put(Ex06.idx, ex);
		ex=new Ex06("세탁기", 700);
		map.put(Ex06.idx, ex);
		ex=new Ex06("전자렌지", 300);
		map.put(Ex06.idx, ex);
		ex=new Ex06("TV", 2000);
		map.put(Ex06.idx, ex);

		for(Integer key : map.keySet()) {
			System.out.println("상품명 : "+map.get(key).getGoodsName());
			System.out.println("가격 : "+map.get(key).getGoodsPrice()+"원");			
		}
		
		
		
		
	}

}
