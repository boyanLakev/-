import java.util.Scanner;
public class IOZad2 {

	/**
	 * 2. �������� ��������, ����� ���� �� ��������� ������� "r" �� ���� �
��������� ������� ��������� � ��������.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		Scanner input=new Scanner(System.in);
	    System.out.println("�������� ������� �� ����������");
	    double radius=input.nextDouble();
	    Double perimetar=2*pi*radius;
	    Double area=pi*radius*radius;
	    
	    System.out.printf("���������� � ������ %.2f ��� ��������  %.2f %n����� � � ���������� �� ���������� " +
	    		"� ������ �� ������ ��������� � %f  %n %n,������ ����� �� � ������ ����� ������� � ����� ��� ��������" +
	    		" � ��� ���������� �� �������", radius,perimetar,area);
	    

	}

}
