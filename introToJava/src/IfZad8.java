import java.util.Scanner;
public class IfZad8 {

	/**
	 * 8. �������� ��������, ����� ������� ����� ����� ��� ������ ����� � ��������� [1..9] ���� ��������� �� �������� �������:
- ��� ������� �� ����� 1 � 3, ���������� �� �������� �� 10.
- ��� ������� �� ����� 4 � 6, �� �������� �� 100.
- ��� ������� �� ����� 7 � 9, �� �������� �� 1000.
- ��� ������� �� 0 ��� ������ �� 9 , � � ��������� ��������� �� ������.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������, ����� ������� ����� ����� ��� ������ ����� � ��������� [1..9]");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "  ");
		System.out.println( " ��������� ����� �� 0 �� 9 ");
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
		default:System.out.println( "�������� �� ��������� ����� !!!!!!!  ");
	    }
		System.out.println("����� ������� �� �� "+ chislo);
		
	}

}
