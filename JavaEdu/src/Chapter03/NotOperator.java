package Chapter03;

public class NotOperator {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 13;
		boolean led = true;
		
		System.out.println("led 변수의 논리 값 => " + led);
		System.out.println("led 변수의 논리 값 변경 => " + !led);
		System.out.println("num1 > num2 의 결과 => " + (num1 > num2));
		System.out.println("num1 > num2 의 결과값 반전 => " + !(num1 > num2));
	}

}
