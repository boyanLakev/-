import java.util.Scanner;

public class ReadingStringNewStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("��������� ������� �� ��� ");
		String firstName= input.nextLine();
		
		System.out.print("��������� ������� �� ��� ");
		String lastName= input.nextLine();
		System.out.printf(" ������ %s %S ��� � �����?", firstName,lastName);
	}

}
