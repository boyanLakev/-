import java.util.Scanner;
public class loopZad2 {

	/**
	 * �������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N, ����� �� �� ����� �� 3 � 7. ������� N �� ���� �� ����������� ����.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������, ����� ��������� �� ��������� ������� �� 1 �� N");
		System.out.println(" ����� �� �� ����� �� 3 � 7 ");
		System.out.println(" ");
		System.out.println("�������� N � :");
		int n = input.nextInt();
		for (int i=1;i<n;i++){
			if ((i%3==0)||(i%7==0)){
				continue;
			}
			System.out.println(i);
			 
			
			}
	}

}
