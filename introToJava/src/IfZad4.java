import java.util.Scanner;
public class IfZad4 {
	/*
	 * 
	 * 4. Напишете програма, която за дадена цифра (0-9), зададена като вход, 
	 * извежда името на цифрата на български език.

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method s
		System.out.println("програма, която за дадена цифра (0-9), зададена като вход, \r\n" + 
				" извежда името на цифрата на български език.");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "  ");
		System.out.println( " Възведете число от 0 до 9 ");
		int chislo=input.nextInt();
		
			
		
			String chisloBul=null;
			switch (chislo) {
			    case 0:chisloBul="нула";break;
				case 1:chisloBul="едно";break;
				case 2:chisloBul="две";break;
				case 3:chisloBul="три";break;
				case 4:chisloBul="четири";break;
				case 5:chisloBul="пет";break;
				case 6:chisloBul="шест";break;
				case 7:chisloBul="седем";break;
				case 8:chisloBul="осем";break;
				case 9:chisloBul="девет";break;
				default:System.out.println( "Въведени са некорекни данни !!!!!!!  ");
			}
			if (chisloBul!=null) {
				System.out.println(chisloBul);
			}
			
		
		
		

	}

}
