import java.util.Scanner;

public class loopZad10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Въведете 0<N<20 ");
		int n=input.nextInt();
		for (int i=1; i<=n;i++){
			for(int j=i; j<=i+n;j++){
				//корекция на едноцифрените
					 if (j<10){
						 System.out.print(" ");
					 }
				System.out.print(j+" ");
				
				
			}
			System.out.println(" ");
		}
		

	}

}
