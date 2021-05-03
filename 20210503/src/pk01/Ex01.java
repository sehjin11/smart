package pk01;

public class Ex01 {

	public void gugu(int stDan, int edDan, int stGop, int edGop) {
		for(int d=stDan;d<=edDan;d++) {
			System.out.println("============================");
			for(int g=stGop;g<=edGop;g++) {
				System.out.println(d+" * "+g+" = "+d*g);
			}
		}
	}
}
