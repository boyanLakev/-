import java.util.Scanner;
public class dopzadacha8 {

	/**
	 * 8. �������� ��������, ����� ��������� ���� ������ ����� � (x, y) �
		*����� � ����������� � ((0,0), 5).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������� ������������ �� ������� �� �");
		float x=input.nextInt();
		System.out.println("��������� ������������ �� ������� �� �");
		float y=input.nextInt();
		if ((x*x+y*y)<=25){
			System.out.println("������� � �������� �� ���������� K � ������ 5 ");
		
		}else{
			System.out.println("�������  �� � �������� �� ���������� K � ������ 5 ");
			System.out.println("�������  � ���������� �� ����������� �� ���� � ���� ��������� ");
		}
			
		

	}

}
