package pk03;

public class Ex18test {

	public static void main(String[] args) {

		String str1="Java Programming";
		String str2="JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1=str1.toLowerCase();	//문자열을 모두 소문자로 만들어주는 메서드 .toLowerCase()
		String lowerStr2=str2.toLowerCase();
		
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		
		String upperStr1=str1.toUpperCase();
		String upperStr2=str2.toUpperCase();
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		String str3= " 박세진 ";
		if(str3.trim().equals("박세진")) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
		//trim()은 앞뒤 공백 제거
		
		
		str3=" 박세진 박정후 또치 ";
		System.out.println(str3.trim());
		//중간 공백은 제거x
		
		
		int i=10;
		double d = 10.5;
		boolean b=true;
		String i1="10";
		int result = Integer.parseInt(i1);
		System.out.println(result);
		
		String result1 = String.valueOf(i);
		System.out.println(result1);
		result1=String.valueOf(d);
		System.out.println(result1);
		result1=String.valueOf(b);
		System.out.println(result1);
		
		
		
	}

}
