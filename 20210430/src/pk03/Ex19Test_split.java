package pk03;

public class Ex19Test_split {
	public static void main(String[] args) {
		
		String text="���� �ڹٸ� �� �մϴ�.";
		String [] res =text.split(" ");
		//Ư�� ���ڿ��� �������� �߶󳻼� �迭�� ����
		
		for(String str : res) {
			System.out.println(str);
		}
		
		text="����'�ڹٸ�'��'�մϴ�.";
		res=text.split("'");
		for(String str : res) {
			System.out.println(str);
		}
		
		
		text="����/�ڹٸ�&��'�մϴ�.";
		res=text.split("/|&|'");
		for(String str : res) {
			System.out.println(str);
		}
		// |�� or�� �ǹ�
		
		
		text="asdgfdgfgfhsdfgadgfdghfddsgasdf";
		res=text.split("gf");
		System.out.println("gf�� ���� : "+(res.length-1));
	}
}
