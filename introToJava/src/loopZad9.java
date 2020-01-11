
public class loopZad9 {

	/**
	 * Catalan number
	 */
	public static void main(String[] args) {
		// ke e ,rechend ?? for kd cajalan ???
		int n=6;
		int catalan=1;
		for (int i=1;i<=n;i++){
			catalan*=i;
		}
		System.out.print(catalan);
	}

}
