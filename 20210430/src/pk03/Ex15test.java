package pk03;

public class Ex15test {

	public static void main(String[] args) {

		String oldStr="���� python�� ���ƿ�.";
		
		String newStr=oldStr.replace("python", "java");
		System.out.println(newStr);
		System.out.println(oldStr);
		
		oldStr=oldStr.replace("python", "java");
		System.out.println(oldStr);
	}

}
