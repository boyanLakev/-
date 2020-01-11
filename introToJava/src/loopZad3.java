import java.util.Scanner;
public class loopZad3 {

	/**
	 * Напишете програма, която чете от конзолата поредица от цели числа и отпечатва най-малкото и най-голямото от тях.

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
		int min=list[0];
		int max=list[0];
		for (int i=1;i<n;i++){
			if (list[i]>max){
				max=list[i];
			}
			if (list[i]<min){
				min=list[i];
			}
			
			
			
			}
		System.out.println(" най Малкото число е : "+ min);
		System.out.println(" най Голямо число е : "+ max);
	}

}
