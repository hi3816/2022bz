package cctvEx;

public class main {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new Complete();
		
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.times(num1,num2));
	}

}
