package pk1;

import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {

		int [] i =new int[3];
		//�迭�� ������ �� ũ�⸦ �����ؾ��Ѵ�. ���߿� �ø� ���� ����.(����)
		//HashMap�� ũ�⸦ ������ �ʰ� ����ϰ� ���ϴ� ��ŭ ������ �� �ִ�(Ȯ��)
		
		HashMap<String, String> map = new HashMap<String, String>();
		//HashMap<key, value>
		
		map.put("high0","�ڼ���");
		map.put("high1","������");
		map.put("high2","���߱�");
		map.put("high3","������");
		map.put("high4","������");
		
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
