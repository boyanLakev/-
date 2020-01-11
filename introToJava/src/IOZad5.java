import java.util.Scanner;
public class IOZad5 {

	/**
	 * 5. Напишете програма, която чете от конзолата две цели числа и
отпечатва по-голямото от тях. Реализирайте програмата без използването
на сравнение. Забележка: задачата изисква малко да помислите!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println("Въведете Първото число : ");
	    int a=input.nextInt();
	    System.out.println("Въведете второто число : ");
	    int b=input.nextInt();
	    int c= ( Math.abs(a-b)+a+b)/2;
	    System.out.println(c);
	    
	    
	    

	}

}
