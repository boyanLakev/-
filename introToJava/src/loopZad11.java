import java.util.Scanner;
public class loopZad11 {

	/**
	 * 11. �������� ��������, ����� �������� �� ����� ���� �������� ���������� �� ������ �����. �������:
             N = 10 -> N! = 3628800 -> 2
             N = 20 -> N! = 2432902008176640000 -> 4

	 */
	public static void main(String[] args) {
		// ������� �����
		Scanner input=new Scanner(System.in);
		System.out.println("��������, ����� �������� �� ����� ���� �������� ���������� �� ������ �����");
		System.out.println("  ");
		System.out.println("��������� ����� �� � N �� n! ;");
		int n=input.nextInt();
		long fac=1;
		//����������� �� ����������
		for (int i=1;i<=n;i++){
			fac*=i;
		}
		//����������� �� ������
		 
		
	}

}
