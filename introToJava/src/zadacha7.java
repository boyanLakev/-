import java.util.Scanner;
public class zadacha7 {

	/**
	 * 7. ������ �� ��������������� ���� �� ������ � ������������� 17% ��
	*���� �� ������. �������� ��������, ����� �� ��������� �������� ��
 	*����� �� ������, �� �������� ������ �� ������.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������� ����������� �� ������     na ZEMQta");
		float teglo=input.nextInt();
		float tegloLuna=teglo*0.17f;
		System.out.println("������� �� ������ ����� ���� "+teglo+ "��������� �� ������ , ��  ������ �� ���� "+tegloLuna);
		
		
		

	}

}
