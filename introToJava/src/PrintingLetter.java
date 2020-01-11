import java.util.Scanner;
public class PrintingLetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.println("Enter person name:");
		String person =input.nextLine();
		System.out.println("Enter book name ; ");	
		String book =input.nextLine();
		String from="Author Team";
		System.out.printf("Dear %s,%n", person);
		System.out.printf(" We are pleased to inform"+
						" you that\"%2$s\" is the best Bulgarian book.%n"+
						"The author of the wishes you good  luck %s!%n", person,book);
		System.out.println("Yours ,");
		System.out.printf(" %s ", from);

	}

}
