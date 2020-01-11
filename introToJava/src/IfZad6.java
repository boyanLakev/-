
public class IfZad6 {

	/**
	 * 6. Напишете програма, която намира най-голямото по стойност число измежду дадени 5 числа.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("програма, която намира най-голямото по стойност число измежду дадени 5 числа" );
	int chislo1=50;
	int chislo2=789;
	int chislo3=123;
	int chislo4=786;
	int chislo5=450;
	
	System.out.printf(" Стойностите на числата са : %n"
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
	System.out.printf("Най голямото число измежду тях е %d",max);

	}

}
