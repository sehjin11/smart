package pk1;

import java.util.HashMap;
import java.util.Iterator;


public class Ex01 {
	public static void main(String[] args) {
	//�����͸� �����ϴ� �������
	//1.�⺻ �ڷ����� �̿��� ����
	//2.���� �ڷ����� ������ ������ �� �ִ� �迭
	//3.�ٸ� ������ �����͸� ������ �� �ִ� class(������)
	//4.class �迭
	//	
	//�迭�� ������ ���� �� �迭�� ũ�⸦ ���ؾ� �Ѵ�.
	//ex) int i [] = new int [3];  3�̶�� ũ�⸦ ���ؾ��Ѵ�.
	//	
	//ũ�Ⱑ ������ ���� ���� �迭 ���� ��������� ����� �ʹ�(Ȯ�强)
	//ũ�Ⱑ ���� ������ �ڷ��� : Map
		HashMap<Integer, String> map=
				new HashMap<Integer, String>();
		
		map.put(1, "�̼���");		//.put �ʱ�ȭ(�� �Է�)
		map.put(2, "�ڼ���");
		map.put(3, "������");
		map.put(4, "������");
		map.put(5, "������");
		map.put(6, "�ӱԼ�");
		map.put(6, "��â��");
		
		System.out.println(map.get(6));		//.get ���尪 ȣ��
		System.out.println(map.size());		//.size �� ����
		
//		for(int i=0;i<=100;i++) {
//			map.put(i,"�����ٶ�");
//		}
//		
//		System.out.println(map.get(6));		//.get ���尪 ȣ��
		
		
		Iterator<Integer> keys = map.keySet().iterator();
		//.keyset() �� key���� ����
		//Iterator�� ����
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key));
		}
		
	}
}
