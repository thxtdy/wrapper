package ch01;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		// 박싱, 언박싱
		int num1 = 3; // => Integer
		
		Integer num2 = new Integer(3);    // Boxing
		int num3 = num2.intValue();       // Unboxing
		
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		// 자동 박싱, 자동 언박싱
		
		Integer num4 = 17; // 자동 박싱    int <= wrapper => Integer
		int num5 = num4;   // 자동 언박싱  
		
		
	}
	
}
