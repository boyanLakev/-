import java.util.Scanner;
public class dopZadacha9 {

	/**
	 * 9. �������� ��������, ����� ��������� ���� ������ ����� � (x, y) �
����� � ����������� � ((0,0), 5) � � ����� ������������� ((-1, 1), (5,
5).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������� ������������ �� ������� �� �");
		float x=input.nextFloat();
		System.out.println("��������� ������������ �� ������� �� �");
		float y=input.nextFloat();
		
		if ((x*x+y*y)<=25&&((x>-1 && x<5 )&&(y>1 && y<5))){
			System.out.println("������� � �������� �� ���������� K � ������ 5 � �������� -1,1 5,5 ");
		
		}else{
			System.out.println("�������  �� ���������� � �� ���������� � ������ 5 � �� ��������  -1,1 5,5  ");
			System.out.println("��������� �� ������ ���������� �� ��������� ");
		}

	}

}
