import java.util.Scanner;
public class dopzadacha8 {

	/**
	 * 8. Напишете програма, която проверява дали дадена точка О (x, y) е
		*вътре в окръжността К ((0,0), 5).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Възведете координатите на точката по х");
		float x=input.nextInt();
		System.out.println("Възведете координатите на точката по у");
		float y=input.nextInt();
		if ((x*x+y*y)<=25){
			System.out.println("Точката е вътрешна на окръжноста K с радиус 5 ");
		
		}else{
			System.out.println("Точката  не е вътрешна на окръжноста K с радиус 5 ");
			System.out.println("Точката  и окръжноста не принадлежат на едно и също Множество ");
		}
			
		

	}

}
