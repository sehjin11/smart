package pk02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01test {

	public static void main(String[] args) {

		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "�ڼ���");
		map.put(2, "������");
		for(int key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		List<String> list=
				new ArrayList<String>();
		list.add("�ڼ���");
		list.add("������");
		for(String val : list) {
			System.out.println(val);
		}
		
	}

}
