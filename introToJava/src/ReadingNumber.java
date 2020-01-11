import java.util.Scanner;
public class ReadingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("a = ");
				int a = input.nextInt();
		System.out.print("b = ");
				int b = input.nextInt();
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.print("Въведете десетично число");
		System.out.print("f = ");
				float f = input.nextFloat();
		System.out.printf("%d * %d / %.2f = %.3f%n",a, b, f, a * b / f);
		
		
		

	}

}
