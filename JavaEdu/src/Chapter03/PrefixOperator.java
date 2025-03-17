package Chapter03;

public class PrefixOperator {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = ++num1;	// num1의 값을 먼저 1증가 시킨 후 연산 수행
		
		System.out.println("num1 의 값 : " + num1);
		System.out.println("num2 의 값 : " + num2);
		System.out.println("++num1 의 값 : " + ++num1);
	}

}
