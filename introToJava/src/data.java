
public class data {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("The time is : %1$tH:%1$tM:%1$tS.\n", new java.util.Date());
		Data date = new Date();
		System.out.printf("The date in Day/Month/Year is:" +
				"%1$td/%1$tm/%1$tY.\n", date);
		System.out.print(date);
		System.out.println("");
		System.out.printf("днес и точното време е : %1$tA %1$tI:%1$tM%1$tp %1$tB/%1$tY. \n", date);
		
		
	}

}
