import java.util.Scanner;

public class mStepN {

	/**
	 * m NA stepen N
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("������ �� ����������� �� ����� :");
		System.out.print("��������  �������  :");
		int m=input.nextInt();
		System.out.print("�������� �������� :");
		int n=input.nextInt();
		int step=1;
		for (int i=1;i<(n+1);i++){
			step=step*m;
		}
		System.out.printf(" ������� %d �� ������ %d e ����� �� %d ",m,n,step);

	}

}
