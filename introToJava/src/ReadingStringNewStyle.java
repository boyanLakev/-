import java.util.Scanner;

public class ReadingStringNewStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Възведете първото си име ");
		String firstName= input.nextLine();
		
		System.out.print("Възведете първото си име ");
		String lastName= input.nextLine();
		System.out.printf(" Зравей %s %S как я караш?", firstName,lastName);
	}

}
