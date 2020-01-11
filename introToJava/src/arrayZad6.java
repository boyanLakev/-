import java.util.Scanner;
public class arrayZad6 {

	/**
	 * 6. Да се напише програма, която чете от конзолата две цели числа N и K,
и масив от N елемента. Да се намерят тези K елемента, които имат
максимална сума.
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// въвеждане на данни
					//int n=10;
					//int k=5;
					//int[] mas={1,3,7,34,54,23,78,55,33,2};
		
		System.out.println(" въведете размера на масива N ");
		int n=input.nextInt();
		System.out.println(" въведете областа от масива k ");
		int k=input.nextInt();
		int[] mas=new int[n+1];
		for (int i=0;i<n;i++){
			System.out.println(" въведете "+i+" число ");
			mas[i]=input.nextInt();
		}
		
		
		//sort k elementa
				
		for (int i=0;i<=k+1;i++){
			for (int j=i+1;j<mas.length;j++){
				if (mas[i]<mas[j]){
				/*	mas[i]=mas[i]+mas[j];// a=a+b
					mas[j]=mas[i]-mas[j];// b=a-b
					mas[i]=mas[i]-mas[j];// b=a-b */
					int tem=mas[i]; //размяна с трета клетка
					mas[i]=mas[j];
					mas[j]=tem;
				}
			}
		}
		//print
		int sum=0;
		System.out.print(" { ");
		for(int i=0;i<k;i++){
			System.out.print(mas[i]+" , ");
			sum=sum+mas[i];
		}
		System.out.print(" } ");
		System.out.println("  ");
		System.out.println(" Sumata is : "+ sum);

	}

}
