import java.util.Scanner;
public class LoopZad5 {

	/**
	 * �������� ��������, ����� ���� �� ��������� ������� N
� ��������� ������ �� ������� N ����� �� �������� �� ��������:
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println(" N ����� �� �������� �� ��������");
		System.out.println("  ");
		System.out.println("�������� N �����  :");
		int n = input.nextInt();
		
		int pre=0;
		int next=1;
		int fib;
		// ����� ����
		if (n>=2) {
			System.out.println(pre);
					
		}
		// ����� ����
		if (n>=2) {
			System.out.println(next);
			
		}
		// �� ����� �� N ��
		for (int i=3 ; i<=n;i++){
			fib=next+pre;
			pre=next;
			next=fib;
			System.out.println(fib);
		}
		
		
		
			
			
			
		}
		

	}


