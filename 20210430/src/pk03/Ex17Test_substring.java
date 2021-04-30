package pk03;

public class Ex17Test_substring {

	public static void main(String[] args) {

		String str="123456789";
		
		System.out.println(str.indexOf("3"));
		System.out.println(str.substring(2,6));
		
		
		
		str="xiosdjfoiwjeisdfjsdsdlskjwoierasdfoixbksdjwer";
		int idx;
		int count=0;

		while(true) {
		idx=str.indexOf("sd");
		if(idx!=-1) {
		System.out.println(idx);
		str=str.substring(idx+2);
		System.out.println(str);
		count++;
		}
		else {
			System.out.println("sdÀÇ °¹¼ö : "+count);
			break;
		}
		}
	}
}
