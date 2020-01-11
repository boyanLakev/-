
public class IfZad3 {
/*
 * 
 * 3. Напишете програма, която намира най-голямото по стойност число,
 *  измежду три дадени числа.
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method s
		System.out.println("3.  програма, която намира най-голямото по стойност число,"
					+ " измежду три дадени числа.\r\n" );
		int chislo1=5;
		int chislo2=78;
		int chislo3=45;
		System.out.printf(" Стойностите на числата са : %n"
				+ "    chislo1 = %d , %n"
				+ "    chislo2 = %d , %n"
				+ "    chislo3 = %d , %n ", chislo1,chislo2,chislo3);
		int max=chislo1;
		if (max<chislo2) {
			max=chislo2;
		}
		if (max<chislo3) {
			max=chislo3;
		}
		
		System.out.printf("Най голямото число измежду трите е %d",max);

	}

}
