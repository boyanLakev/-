import java.util.Scanner;

public class IOZad7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double var=0;
		double max=0;	
		for (int i=1;i<6;i++){
			System.out.printf("Въведете %d число :", i);
			var=input.nextDouble();
				if (var>max) {
					max=var;
				}
		}
		
		System.out.println("Най голямото число е  :"+ max);

	}
}


