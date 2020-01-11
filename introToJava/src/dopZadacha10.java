import java.util.Scanner;


public class dopZadacha10 {

	/**
	 * 10. Напишете програма, която приема за вход четирицифрено число във
формат abcd и след това извършва следните действия върху него:
- Пресмята сбора от цифрите на числото.
- Разпечатва на конзолата цифрите в обратен ред: dcba.
- Поставя последната цифра, на първо място: dabc.
- Разменя мястото на втората и третата цифра: acbd
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Възведете четирицифрено число :");
		int abcd = input.nextInt();
		int d = abcd%10;
		int abc = abcd/10;
		int c = abc%10;
		int ab = abc/10;
		int b =ab%10;
		int a = ab/10;
		
		System.out.print("сбора от цифрите на числата ");
		System.out.println(a+b+c+d);
		int dabc= d*1000+a*100+ b*10+c;
		System.out.print("Поставя последната цифра, на първо място: dabc ");
		System.out.println(dabc);
		int acbd= a*1000+c*100+ b*10+d;
		System.out.print("Разменя мястото на втората и третата цифра: acbd ");
		System.out.println(acbd);
	}

}
