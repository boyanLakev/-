import java.util.Scanner;
public class loopZad3 {

	/**
	 * �������� ��������, ����� ���� �� ��������� �������� �� ���� ����� � ��������� ���-������� � ���-�������� �� ���.

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
		int min=list[0];
		int max=list[0];
		for (int i=1;i<n;i++){
			if (list[i]>max){
				max=list[i];
			}
			if (list[i]<min){
				min=list[i];
			}
			
			
			
			}
		System.out.println(" ��� ������� ����� � : "+ min);
		System.out.println(" ��� ������ ����� � : "+ max);
	}

}
