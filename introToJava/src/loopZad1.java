import java.util.Scanner;

public class loopZad1 {

	/**
	 * �������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N. ������� N �� ���� �� ����������� ����.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������, ����� ��������� �� ��������� ������� �� 1 �� N");
		System.out.println("  ");
		System.out.println("�������� ����� ����� ������� �� �������� :");
		int n = input.nextInt();
		int[] list=new int[n];
		
		for (int i=0;i<n;i++){
			System.out.println("�������� "+i+"  ����o :");
			 list[i]=input.nextInt();
			
			}
		for (int i=0;i<n;i++){
			System.out.print(i+" Cell is "+list[i]+"  next :");
			
			
			}
		System.out.println(" ");
		System.out.println(" ���� ������ �� ��������� ");
		System.out.println(" ");
		for (int i=0;i<n;i++){
			System.out.println(list[i]);
			
			
			}
		
		

	}

}
