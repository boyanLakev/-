import java.util.Scanner;
public class arrayZad2 {

	/**
	 * 2. �� �� ������ ��������, ����� ���� ��� ������ �� ��������� � ��������� ���� �� �������.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��������, ����� ���� ��� ������ �� ��������� � ��������� ���� �� �������.");
		System.out.println(" ");
		System.out.println("������� ������� �� �������� :");
		int area=input.nextInt();
		int[] a=new int[area];
		int[] b=new int[area];
		System.out.println(" ");
		System.out.println("�� ������ ����� �������� : ");
		for (int i=0;i<area;i++){
			System.out.printf("element  %d e ",i);
			a[i]=input.nextInt();
			System.out.println(" ");
		}
		System.out.println("�� ������ ����� �������� : ");
		for (int i=0;i<area;i++){
			System.out.printf("element  %d e ",i);
			b[i]=input.nextInt();
			System.out.println(" ");
		}
		// ���������
		boolean proverca=true;
		for (int i=0;i<area;i++){
			
			if (a[i]!=b[i]){
				proverca=false;
			}
			
		}
		//��������
		if (proverca){
			System.out.println(" �������� �� ������� : ");
		}else{
			System.out.println(" �������� �� �������� : ");
		}
		
		 
		
	}
	

}
