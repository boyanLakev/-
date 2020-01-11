
public class chaost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x= 0.1f ;
		
		
		for(int i=1; i<100; i++){
			x=3.9f*x*(1.0f-x);
            System.out.println(x);
       } 

	}

}
