import java.util.Scanner;
public class ifZad9 {

	/**
	 * 9. Напишете програма, която преобразува дадено число в интервала
[0..999] в текст, съответстващ на българското произношение.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("програма, която за дадена цифра (0-9), зададена като вход, \r\n" + 
				" извежда името на цифрата на български език.");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "  ");
		System.out.println( " Въведете число от 0 до 999 ");
		int chislo=input.nextInt();
		int abc=chislo;
		int c=abc%10;
		int ab=abc/10;
		int b=ab%10;
		int a=ab/10;
		int bc=abc%100;
		String chisloBul=null;
		switch (a) {
				    case 0:chisloBul=" ";break;
					case 1:chisloBul="сто";break;
					case 2:chisloBul="двеста";break;
					case 3:chisloBul="триста";break;
					case 4:chisloBul="четиристотин";break;
					case 5:chisloBul="петстотин";break;
					case 6:chisloBul="шестстотин";break;
					case 7:chisloBul="седемстотин";break;
					case 8:chisloBul="осемстотин";break;
					case 9:chisloBul="деветстонин";break;
					default:
	        }
		if (b!=0 && a!=0){
			chisloBul=chisloBul+" "+"и"+" ";
			
		}
		if (b==1){
			switch (bc) {
		    case 10:chisloBul=chisloBul+"десет";break;
			case 11:chisloBul=chisloBul+"единадесет";break;
			case 12:chisloBul=chisloBul+"дванадесет";break;
			case 13:chisloBul=chisloBul+"тринадесет";break;
			case 14:chisloBul=chisloBul+"четиринадесет";break;
			case 15:chisloBul=chisloBul+"петнадесет";break;
			case 16:chisloBul=chisloBul+"шестнадесет";break;
			case 17:chisloBul=chisloBul+"седемнадесет";break;
			case 18:chisloBul=chisloBul+"осемнадесет";break;
			case 19:chisloBul=chisloBul+"деветнадесет";break;
		default:
	}
		
	}else{
		switch (b) {
		    case 0:;break;
			
			case 2:chisloBul=chisloBul+"дведесет";break;
			case 3:chisloBul=chisloBul+"тридесет";break;
			case 4:chisloBul=chisloBul+"четиридесет";break;
			case 5:chisloBul=chisloBul+"петдесет";break;
			case 6:chisloBul=chisloBul+"шестдесет";break;
			case 7:chisloBul=chisloBul+"седемдесет";break;
			case 8:chisloBul=chisloBul+"осемдесет";break;
			case 9:chisloBul=chisloBul+"деветдесет";break;
		    default:
         }
		
		if (c!=0&& b!=0){
			chisloBul=chisloBul+" "+"и"+" ";
		}
		switch (c) {
			    case 0:;break;
			    case 1:chisloBul=chisloBul+"едно";break;
				case 2:chisloBul=chisloBul+"две";break;
				case 3:chisloBul=chisloBul+"три";break;
				case 4:chisloBul=chisloBul+"четири";break;
				case 5:chisloBul=chisloBul+"пет";break;
				case 6:chisloBul=chisloBul+"шест";break;
				case 7:chisloBul=chisloBul+"седем";break;
				case 8:chisloBul=chisloBul+"осем";break;
				case 9:chisloBul=chisloBul+"девет";break;
			    default:
		}
			
		
	}
			if (chislo==0){
				chisloBul="Нула";
			}
			
	System.out.println(chisloBul);	
			
		
			
			
			
			}

	}


