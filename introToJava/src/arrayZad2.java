import java.util.Scanner;
public class arrayZad2 {

	/**
	 * 2. Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("програма, която чете два масива от конзолата и проверява дали са еднакви.");
		System.out.println(" ");
		System.out.println("Задайте размера на масивите :");
		int area=input.nextInt();
		int[] a=new int[area];
		int[] b=new int[area];
		System.out.println(" ");
		System.out.println("За първия масив въведете : ");
		for (int i=0;i<area;i++){
			System.out.printf("element  %d e ",i);
			a[i]=input.nextInt();
			System.out.println(" ");
		}
		System.out.println("За втория масив въведете : ");
		for (int i=0;i<area;i++){
			System.out.printf("element  %d e ",i);
			b[i]=input.nextInt();
			System.out.println(" ");
		}
		// сравнение
		boolean proverca=true;
		for (int i=0;i<area;i++){
			
			if (a[i]!=b[i]){
				proverca=false;
			}
			
		}
		//резултат
		if (proverca){
			System.out.println(" Масивите се еднакви : ");
		}else{
			System.out.println(" Масивите се различни : ");
		}
		
		 
		
	}
	

}
