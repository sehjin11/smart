package pk02;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class Ex04test {

	public static void main(String[] args) {

		
		HashMap<Integer, Ex03> map =new HashMap<Integer, Ex03>();	
		Ex03 ex=new Ex03("high0","�ڼ���");
		map.put(ex.idx1, ex);				//key���� �̸��� �Է�
		Ex03 ex1=new Ex03("high1","���켺");
		map.put(ex1.idx1, ex1);
		Ex03 ex2=new Ex03("high2","���߱�");
		map.put(ex2.idx1, ex2);
		
		System.out.println(map.get(2).getName());
		
	}

}
