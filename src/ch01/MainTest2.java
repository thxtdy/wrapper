package ch01;

public class MainTest2 {
	
	public static void main(String[] args) {
		
		String str1 = "10A";
		String str2 = "20.5";
		String str3 = "true";
		
		System.out.println(str2 + 100); // 100이 자동으로 문자열로 처리됨 . 출력값 : 20.5100
		System.out.println(str2 + "A");
		
		// 문자열의 데이터 타입을 정수값으로 변경하는 방법
		
		try {
			int n1 = Integer.parseInt(str1);
			System.out.println(n1 + 59);
		} catch (Exception e) {
			System.out.println("잘못된 입력값이이이");
		}
		
		// str2 => double : 8byte
		double d = Double.parseDouble(str2);
		System.out.println(d + 0.1);
		
		// str3 => boolean : 1byte
		boolean b = Boolean.parseBoolean(str3);
		b = false;
		System.out.println(b);
		
		// 반대로 int 값을 String 데이터 타입으로 변환한다면
		int number = 10000;
		String numberStr = String.valueOf(number);
		System.out.println(numberStr + 10); // 출력값 : 1000010 , 데이터 타입이 String으로 변경되었기 때문에 문자열 합치기가 됨
		
		
	}
	
	
}
