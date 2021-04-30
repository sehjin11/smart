package pk03;

public class Ex12Test {

	public static void main(String [] args) {
		
		String name="박세진";
		String name1=new String("박세진");
		String name2="박세진";
		
		if(name==name2) {
			System.out.println("객체의 주소가 같습니다.");
		}else {
			System.out.println("객체의 주소가 다릅니다.");
		}
		
		if(name==name1) {
			System.out.println("객체의 주소가 같습니다.");
		}else {
			System.out.println("객체의 주소가 다릅니다.");
		}
		
		
		
		if(name.equals(name2)) {
			System.out.println("객체의 값이 같습니다.");
		}
		else {
			System.out.println("객체의 값이 다릅니다.");
		}
	}
}
