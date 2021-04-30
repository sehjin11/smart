package pk03;

import java.util.StringTokenizer;

public class Ex20test_StringTokenizer {

	public static void main(String[] args) {

		String text="ȫ�浿/��û��/�ڼ�ȫ";
		StringTokenizer st=new StringTokenizer(text, "/");
		//split�� �迭�� �����ߴٸ�, StringTokenizer�� �߶󳽰� �ٷ� ����� �� �ִ�.
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}
/*
 * charAt(index) : index�� �ش��ϴ� ���� ���
 * equals() : ���ڿ� ���� ������ ��
 * getBytes() : ���ڿ��� byte�� ����. ������ ũ�� �� ���ִ�
 * indexOf() : ���ڳ� ���ڿ��� �ش� index ���
 * length : ������ ����
 * replace() : ���ڿ� �ٲٱ�
 * substring(start,end) : start~end���ڿ� �ڸ���
 * toUpperCase() : ��� �ҹ���
 * toUpperCase() : ��� �빮��
 * trim() : ���ڿ� �յ��� ���� ����
 * valueOf() : �⺻�ڷ����� String����
 * split() : ���ڿ��� ���й��ڸ� �������� �߶� �迭�� ��ȯ
 *  
 * 
 */
}
