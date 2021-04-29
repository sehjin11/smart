package pk03;

import java.util.HashMap;

public class Ex09test {

	public static void main(String[] args) {

		HashMap<String, Ex09> map=new HashMap<String, Ex09>();
		
		Ex09 ex=new Ex09("asd", "asdfa@naver.com");
		map.put(ex.userId, ex);
		ex=new Ex09("asd1", "asdfa4@gmail.com");
		map.put(ex.userId, ex);
		ex=new Ex09("asd2", "asdfa5@hanmail.net");
		map.put(ex.userId, ex);
		ex=new Ex09("asd3", "asdfa6@daum.net");
		map.put(ex.userId, ex);
		
		
		for(String str : map.keySet()) {
			System.out.println(map.get(str).getEmail());
		}
	}

}
