import java.util.Scanner;
public class ifZad1 {

	/**
	 * 1. Да се напише if-конструкция, която изчислява стойността на две 
	 * целочислени променливи и разменя техните стойности, 
	 * ако стойността на първата променлива е по-голяма от втората.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Въведете първото число :");
		float a=input.nextFloat();
		System.out.print("Въведете второто число :");
		float b=input.nextFloat();
		float c=0;
		if (a>b){
			c=a;
			a=b;
			b=c;
			
		}
		System.out.println("Първата променлива е с стойност вече : "+a);
		System.out.println("Втората променлива е с стойност вече : "+b);
	}

}
