import java.util.Scanner;
public class ifBig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers.");
			int firstNumber = input.nextInt();
			int secondNumber = input.nextInt();
			int biggerNumber = firstNumber;
		if (secondNumber > firstNumber) {
			biggerNumber = secondNumber;
		}
		System.out.printf("The bigger number is: %d%n", biggerNumber);


	}

}
