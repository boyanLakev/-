
public class IfZad6 {

	/**
	 * 6. �������� ��������, ����� ������ ���-�������� �� �������� ����� ������� ������ 5 �����.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������, ����� ������ ���-�������� �� �������� ����� ������� ������ 5 �����" );
	int chislo1=50;
	int chislo2=789;
	int chislo3=123;
	int chislo4=786;
	int chislo5=450;
	
	System.out.printf(" ����������� �� ������� �� : %n"
			+ "    chislo1 = %d , %n"
			+ "    chislo2 = %d , %n"
			+ "    chislo3 = %d , %n "
			+ "    chislo3 = %d , %n "
			+ "    chislo3 = %d , %n "
			,chislo1,chislo2,chislo3,chislo4,chislo5);
	int max=chislo1;
	if (max<chislo2) {
		max=chislo2;
	}
	if (max<chislo3) {
		max=chislo3;
	}
	if (max<chislo4) {
		max=chislo4;
	}
	if (max<chislo5) {
		max=chislo5;
	}
	System.out.printf("��� �������� ����� ������� ��� � %d",max);

	}

}
