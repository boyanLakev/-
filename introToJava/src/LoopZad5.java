import java.util.Scanner;
public class LoopZad5 {

	/**
	 * Напишете програма, която чете от конзолата числото N
и отпечатва сумата на първите N члена от редицата на Фибоначи:
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println(" N члена от редицата на Фибоначи");
		System.out.println("  ");
		System.out.println("Въведете N члена  :");
		int n = input.nextInt();
		
		int pre=0;
		int next=1;
		int fib;
		// Първи член
		if (n>=2) {
			System.out.println(pre);
					
		}
		// Втори член
		if (n>=2) {
			System.out.println(next);
			
		}
		// От трети до N ти
		for (int i=3 ; i<=n;i++){
			fib=next+pre;
			pre=next;
			next=fib;
			System.out.println(fib);
		}
		
		
		
			
			
			
		}
		

	}


