import java.util.Scanner;
public class ifZad1 {

	/**
	 * 1. �� �� ������ if-�����������, ����� ��������� ���������� �� ��� 
	 * ����������� ���������� � ������� ������� ���������, 
	 * ��� ���������� �� ������� ���������� � ��-������ �� �������.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("�������� ������� ����� :");
		float a=input.nextFloat();
		System.out.print("�������� ������� ����� :");
		float b=input.nextFloat();
		float c=0;
		if (a>b){
			c=a;
			a=b;
			b=c;
			
		}
		System.out.println("������� ���������� � � �������� ���� : "+a);
		System.out.println("������� ���������� � � �������� ���� : "+b);
	}

}
