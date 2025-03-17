package Chapter03;

public class CharTypeOperator {

	public static void main(String[] args) {
		
		char c1 = 'A';
		int n1 = c1;
		// char c2 = c1 + 1; // 오류 발생
		// Type mismatch: cannot convert from int to char
		int n2 = c1 + 1;
		
		System.out.println(c1);
		System.out.println(n1);
		System.out.println(n2);

	}

}
