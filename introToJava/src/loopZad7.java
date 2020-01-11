
public class loopZad7 {

	/**
	 * 7. Напишете програма, която пресмята N!*K!/(N-K)! за дадени N и K.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" програма, която пресмята N!*K!/(N-K)! за дадени N и K.");
		System.out.println("  ");
		
		double n = 6;
		double k =3;
		double nk=n-k;
		
		System.out.println(" N e  :"+n);
		System.out.println(" K e  :"+k);
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
		// (N- K)!
				double nkFac=1;
				
				while (true) {
					if (nk == 1) {
					break;
					}
					 nkFac *= nk;
					nk--;
					}
		// N!*K!/(N-K)!
		System.out.println("Result is : "+nFac+" * "+kFac+" / "+nkFac+" = "+((nFac*kFac)/nkFac));
			

	}

}
