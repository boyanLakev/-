import java.util.Scanner;

public class IOzad6 {

	/**
	 * 6. �������� ��������, ����� ���� ��� ����� � ��������� ������� ����.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double var=0;
		double sum=0;	
		for (int i=1;i<6;i++){
			System.out.printf("�������� %d ����� :", i);
			var=input.nextDouble();
			sum=sum + var;
		}
		
		System.out.println("������ �� ������� � :"+ sum);

	}

}
