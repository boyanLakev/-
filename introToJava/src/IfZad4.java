import java.util.Scanner;
public class IfZad4 {
	/*
	 * 
	 * 4. �������� ��������, ����� �� ������ ����� (0-9), �������� ���� ����, 
	 * ������� ����� �� ������� �� ��������� ����.

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method s
		System.out.println("��������, ����� �� ������ ����� (0-9), �������� ���� ����, \r\n" + 
				" ������� ����� �� ������� �� ��������� ����.");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "  ");
		System.out.println( " ��������� ����� �� 0 �� 9 ");
		int chislo=input.nextInt();
		
			
		
			String chisloBul=null;
			switch (chislo) {
			    case 0:chisloBul="����";break;
				case 1:chisloBul="����";break;
				case 2:chisloBul="���";break;
				case 3:chisloBul="���";break;
				case 4:chisloBul="������";break;
				case 5:chisloBul="���";break;
				case 6:chisloBul="����";break;
				case 7:chisloBul="�����";break;
				case 8:chisloBul="����";break;
				case 9:chisloBul="�����";break;
				default:System.out.println( "�������� �� ��������� ����� !!!!!!!  ");
			}
			if (chisloBul!=null) {
				System.out.println(chisloBul);
			}
			
		
		
		

	}

}
