import java.util.Calendar;
public class MoreExamplesWithFormatting {


	
/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 120582;
		System.out.format("%d%n", n); // --> "120582"
		System.out.format("%08d%n", n); // --> "00120582"
		System.out.format("%+8d%n", n); // --> " +120582"
		System.out.format("%,5d%n", n); // --> " 120,582"
		System.out.format("%+,8d%n%n", n); // --> "+120,582"

		double pi = Math.PI;
		System.out.format("%f%n", pi); // --> "3.141593"
		System.out.format("%.3f%n", pi); // --> "3.142"
		System.out.format("%10.3f%n", pi); // --> " 3.142"
		System.out.format("%-10.3f%n", pi); // --> "3.142"
		//System.out.format(Locale.ITALIAN,		"%-10.4f%n%n", pi); 
		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c, c, c);
		// --> "Август 9, 2008"
		System.out.format("%tl:%tM %tp%n", c, c, c);
	}

}
