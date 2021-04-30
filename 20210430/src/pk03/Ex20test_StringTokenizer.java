package pk03;

import java.util.StringTokenizer;

public class Ex20test_StringTokenizer {

	public static void main(String[] args) {

		String text="홍길동/심청이/박수홍";
		StringTokenizer st=new StringTokenizer(text, "/");
		//split은 배열에 저장했다면, StringTokenizer는 잘라낸걸 바로 출력할 수 있다.
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}
/*
 * charAt(index) : index에 해당하는 문자 출력
 * equals() : 문자열 값이 같은지 비교
 * getBytes() : 문자열을 byte로 저장. 문자의 크기 알 수있다
 * indexOf() : 문자나 문자열의 해당 index 출력
 * length : 문자의 개수
 * replace() : 문자열 바꾸기
 * substring(start,end) : start~end문자열 자르기
 * toUpperCase() : 모두 소문자
 * toUpperCase() : 모두 대문자
 * trim() : 문자열 앞뒤의 공백 제거
 * valueOf() : 기본자료형을 String으로
 * split() : 문자열을 구분문자를 기준으로 잘라서 배열로 반환
 *  
 * 
 */
}
