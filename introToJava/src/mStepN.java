import java.util.Scanner;

public class mStepN {

	/**
	 * m NA stepen N
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Задача за степенуване на число :");
		System.out.print("Въведете  числото  :");
		int m=input.nextInt();
		System.out.print("Въведете степента :");
		int n=input.nextInt();
		int step=1;
		for (int i=1;i<(n+1);i++){
			step=step*m;
		}
		System.out.printf(" Числото %d на степен %d e равно на %d ",m,n,step);

	}

}
