import java.util.Scanner;

public class loopZad1 {

	/**
	 * Напишете програма, която отпечатва на конзолата числата от 1 до N. Числото N се чете от стандартния вход.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Програма, която отпечатва на конзолата числата от 1 до N");
		System.out.println("  ");
		System.out.println("Въведете колко числа иискате да въведете :");
		int n = input.nextInt();
		int[] list=new int[n];
		
		for (int i=0;i<n;i++){
			System.out.println("Въведете "+i+"  числo :");
			 list[i]=input.nextInt();
			
			}
		for (int i=0;i<n;i++){
			System.out.print(i+" Cell is "+list[i]+"  next :");
			
			
			}
		System.out.println(" ");
		System.out.println(" Друг начина на показване ");
		System.out.println(" ");
		for (int i=0;i<n;i++){
			System.out.println(list[i]);
			
			
			}
		
		

	}

}
