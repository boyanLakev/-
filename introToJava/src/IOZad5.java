import java.util.Scanner;
public class IOZad5 {

	/**
	 * 5. �������� ��������, ����� ���� �� ��������� ��� ���� ����� �
��������� ��-�������� �� ���. ������������ ���������� ��� ������������
�� ���������. ���������: �������� ������� ����� �� ���������!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println("�������� ������� ����� : ");
	    int a=input.nextInt();
	    System.out.println("�������� ������� ����� : ");
	    int b=input.nextInt();
	    int c= ( Math.abs(a-b)+a+b)/2;
	    System.out.println(c);
	    
	    
	    

	}

}
