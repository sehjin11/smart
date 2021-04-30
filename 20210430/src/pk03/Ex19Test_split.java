package pk03;

public class Ex19Test_split {
	public static void main(String[] args) {
		
		String text="저는 자바를 잘 합니다.";
		String [] res =text.split(" ");
		//특정 문자열을 기준으로 잘라내서 배열에 저장
		
		for(String str : res) {
			System.out.println(str);
		}
		
		text="저는'자바를'잘'합니다.";
		res=text.split("'");
		for(String str : res) {
			System.out.println(str);
		}
		
		
		text="저는/자바를&잘'합니다.";
		res=text.split("/|&|'");
		for(String str : res) {
			System.out.println(str);
		}
		// |는 or의 의미
		
		
		text="asdgfdgfgfhsdfgadgfdghfddsgasdf";
		res=text.split("gf");
		System.out.println("gf의 갯수 : "+(res.length-1));
	}
}
