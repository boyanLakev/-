import java.util.Scanner;
public class dopZadacha9 {

	/**
	 * 9. Напишете програма, която проверява дали дадена точка О (x, y) е
вътре в окръжността К ((0,0), 5) и е извън правоъгълника ((-1, 1), (5,
5).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Възведете координатите на точката по х");
		float x=input.nextFloat();
		System.out.println("Възведете координатите на точката по у");
		float y=input.nextFloat();
		
		if ((x*x+y*y)<=25&&((x>-1 && x<5 )&&(y>1 && y<5))){
			System.out.println("Точката е вътрешна на окръжноста K с радиус 5 и квадрата -1,1 5,5 ");
		
		}else{
			System.out.println("Точката  не принадлежи и на окръжноста с радиус 5 и на квадрата  -1,1 5,5  ");
			System.out.println("Условието за двойно съвпадение не изпълнено ");
		}

	}

}
