package pk02;

import java.util.HashMap;

public class Ex08test {

	public static void main(String[] args) {

		HashMap<Integer, Ex06> map=new HashMap<Integer, Ex06>();
		
		Ex06 ex=new Ex06("�����", 1000);
		map.put(Ex06.idx, ex);
		ex=new Ex06("������",500);		
		map.put(Ex06.idx, ex);
		ex=new Ex06("��Ź��", 700);
		map.put(Ex06.idx, ex);
		ex=new Ex06("���ڷ���", 300);
		map.put(Ex06.idx, ex);
		ex=new Ex06("TV", 2000);
		map.put(Ex06.idx, ex);

		for(Integer key : map.keySet()) {
			System.out.println("��ǰ�� : "+map.get(key).getGoodsName());
			System.out.println("���� : "+map.get(key).getGoodsPrice()+"��");			
		}
		
		
		
		
	}

}
