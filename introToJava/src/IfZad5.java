import java.util.Scanner;
public class IfZad5 {
/*
 * 5. �������� ��������, ����� ��� ��������� 
 * �� ������������� (a, b � c) �� ��������� 
 * ���������: ax2 + bx + c , ��������� � 
 * ������� �������� ������ ������.

 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5. �������� ��������, ����� ��� ���������"
				+ " �� ������������� (a, b � c) "
				+ "�� ��������� ���������: ax2 + bx + c ,"
				+ " ��������� � ������� �������� ������ ������.\r\n" + 
				"");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "�������� ����������� � :  ");
		double a=input.nextFloat();
		System.out.println( "�������� ����������� b :  ");
		double b=input.nextFloat();
		System.out.println( "�������� ����������� c :  ");
		double c=input.nextFloat();
		double det=b*b-4*a*c;
		double x1;
		double x2;
		if (det<0){
			System.out.println( " ����������� ���� �������  ");
		}else {
			if (det==0) {
				System.out.println( " ����������� ��� ����  ������� : ");
				x1=((-1)*b)/(2*a);
				System.out.printf("X = %f ",x1);
			}else {
				System.out.println( " ����������� ��� ���  ������� : ");
				x1=((-1)*b+Math.sqrt(det))/(2*a);
				System.out.printf("X 1 = %f %n",x1);
				System.out.println( " � �������   ������� : ");
				x2=((-1)*b+Math.sqrt(det))/(2*a);
				System.out.printf("X 2 = %f %n",x2);
				
				
			}
		}

	}

}
