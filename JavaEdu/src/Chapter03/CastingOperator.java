package Chapter03;

public class CastingOperator {

	public static void main(String[] args) {
		byte num1 = 10;
		byte num2 = 20;
		
		// byte num3 = num1 + num2; // 오류 발생
		// Type mismatch: cannot convert from int to byte
		// 연산은 int 타입으로 자동 변경
		
		byte num3 = (byte)(num1 + num2);
		
		System.out.println(num3);

	}

}
