import java.util.Scanner;
public class loopZad11 {

	/**
	 * 11. Напишете програма, която пресмята на колко нули завършва факториела на дадено число. Примери:
             N = 10 -> N! = 3628800 -> 2
             N = 20 -> N! = 2432902008176640000 -> 4

	 */
	public static void main(String[] args) {
		// входящи данни
		Scanner input=new Scanner(System.in);
		System.out.println("програма, която пресмята на колко нули завършва факториела на дадено число");
		System.out.println("  ");
		System.out.println("възведете колко да е N от n! ;");
		int n=input.nextInt();
		long fac=1;
		//изчисляване на факториела
		for (int i=1;i<=n;i++){
			fac*=i;
		}
		//изчисляване на нулите
		 
		
	}

}
