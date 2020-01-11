import java.util.Scanner;
public class IOzad1 {

	/**
	 * 1. Напишете програма, която чете от конзолата три числа от тип int и
отпечатва тяхната сума.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Въведете първото число :");
		int a=input.nextInt();
		System.out.print("Въведете второто число :");
		int b=input.nextInt();
		System.out.print("Въведете Третото число :");
		int c=input.nextInt();
		System.out.print("Сумата от трите числа е :");
		System.out.println(a+b+c);
		
		
		

	}

}
