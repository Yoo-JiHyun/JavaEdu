package Chapter03;

public class LogicalOperator {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 2;
		
		System.out.println(num1 > 10 && num1 < 50);
		System.out.println(num1 < 10 && num1 < 50);
		System.out.println(num1 > 10 || num2 > 10);
		System.out.println(num1 < 10 || num2 > 10);
	}

}
