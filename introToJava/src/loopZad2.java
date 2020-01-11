import java.util.Scanner;
public class loopZad2 {

	/**
	 * Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7. Числото N се чете от стандартния вход.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Програма, която отпечатва на конзолата числата от 1 до N");
		System.out.println(" които не се делят на 3 и 7 ");
		System.out.println(" ");
		System.out.println("Въведете N е :");
		int n = input.nextInt();
		for (int i=1;i<n;i++){
			if ((i%3==0)||(i%7==0)){
				continue;
			}
			System.out.println(i);
			 
			
			}
	}

}
