
public class loopZad6 {

	/**
	 * 6. �������� ��������, ����� �������� N!/K! �� ������ N � K (1<K<N).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" ��������, ����� �������� N!/K! �� ������ N � K (1<K<N)");
		System.out.println("  ");
		
		double n = 6;
		double k =3;
		System.out.println(" N e  :"+n);
		System.out.println(" k e  :"+k);
		// N!
		double nFac=1;
		
		while (true) {
			if (n == 1) {
			break;
			}
			 nFac *= n;
			n--;
			}
		// K!
		double kFac=1;
		
		while (true) {
			if (k == 1) {
			break;
			}
			 kFac *= k;
			k--;
			}
		// n! /k!
		System.out.println("Result is :"+nFac+" / "+kFac+" = "+(nFac/kFac));
			
		
		
		

	}

}
