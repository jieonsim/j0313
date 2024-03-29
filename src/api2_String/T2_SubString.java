package api2_String;

// 글자 찾기
public class T2_SubString {
	public static void main(String[] args) {
//					   0		 1		  2
//					   01234567890123457890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다.";
		
		// subString() : 지정된 위치(인덱스번지)의 값을 출력
		// subString(n) : 지정된 위치(n)부터 마지막까지 문자열을 출력
		// subString(n,m) : n 인덱스 위치부터 m-1 위치까지 문자열을 출력
		
		System.out.println("1. msg1에 3번째 인덱스 위치부터 출력 : " + msg1.substring(3));
		System.out.println("2. msg1에 3번째부터 12번째 인덱스 위치 앞까지 출력 : " + msg1.substring(3, 12));
		
		
		// Ko~로 단어를 출력 indexOf 이용 (위치 찾기)
		System.out.println("3. Ko ~ " + msg1.indexOf("Ko"));
		System.out.println("4. !!! " + msg1.indexOf("!!!"));
		System.out.println("5. Korea : " + msg1.substring(msg1.indexOf("Ko"), msg1.indexOf("!!!")));
		System.out.println("6. Korea : " + msg1.substring(msg1.indexOf("Welcome"), msg1.indexOf("!!!")));
		
	}
}
