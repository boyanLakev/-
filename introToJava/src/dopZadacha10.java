import java.util.Scanner;


public class dopZadacha10 {

	/**
	 * 10. �������� ��������, ����� ������ �� ���� ������������� ����� ���
������ abcd � ���� ���� �������� �������� �������� ����� ����:
- �������� ����� �� ������� �� �������.
- ���������� �� ��������� ������� � ������� ���: dcba.
- ������� ���������� �����, �� ����� �����: dabc.
- ������� ������� �� ������� � ������� �����: acbd
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������� ������������� ����� :");
		int abcd = input.nextInt();
		int d = abcd%10;
		int abc = abcd/10;
		int c = abc%10;
		int ab = abc/10;
		int b =ab%10;
		int a = ab/10;
		
		System.out.print("����� �� ������� �� ������� ");
		System.out.println(a+b+c+d);
		int dabc= d*1000+a*100+ b*10+c;
		System.out.print("������� ���������� �����, �� ����� �����: dabc ");
		System.out.println(dabc);
		int acbd= a*1000+c*100+ b*10+d;
		System.out.print("������� ������� �� ������� � ������� �����: acbd ");
		System.out.println(acbd);
	}

}
