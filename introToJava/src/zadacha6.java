import java.util.Scanner;
public class zadacha6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Vazvedete Strana A ");
		float stranaA=input.nextInt() ;
		System.out.println("Vazvedete Strana B ");
		float stranaB=input.nextInt() ;
		System.out.println("Vazvedete Visochina ");
		float visochina=input.nextInt() ;
		float area=(stranaA*stranaB)/(2*visochina);
		System.out.println("Area is : "+area);

	}

}
