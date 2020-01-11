import java.util.Scanner;
public class IfZad8 {

	/**
	 * 8. Напишете програма, която прилага бонус точки към дадени точки в интервала [1..9] чрез прилагане на следните правила:
- Ако точките са между 1 и 3, програмата ги умножава по 10.
- Ако точките са между 4 и 6, ги умножава по 100.
- Ако точките са между 7 и 9, ги умножава по 1000.
- Ако точките са 0 или повече от 9 , с е отпечатва съобщение за грешка.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("програма, която прилага бонус точки към дадени точки в интервала [1..9]");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "  ");
		System.out.println( " Възведете число от 0 до 9 ");
		int chislo=input.nextInt();
		switch (chislo) {
	    
		case 1:
		case 2:
		case 3:chislo=chislo*10;break;
		case 4:
		case 5:
		case 6:chislo=chislo*100;break;
		case 7:
		case 8:
		case 9:chislo=chislo*1000;break;
		default:System.out.println( "Въведени са некорекни данни !!!!!!!  ");
	    }
		System.out.println("бонус точките са ви "+ chislo);
		
	}

}
