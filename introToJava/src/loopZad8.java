import java.util.Scanner;


public class loopZad8 {

	/**
	 * n 1,1!/x,2!/x*x.......
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Програма, която отпечатва на конзолата числата от 1 до N");
		System.out.println("  ");
		System.out.println("Въведете x :");
		double x = input.nextInt();
		int n=20;
		double sum=1;
		for(int i=1;i<=n;i++){
			sum+= sum*(i/x);
			
		}
		System.out.println("result is; "+sum);
		

	}

}
