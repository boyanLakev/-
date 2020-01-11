
public class arraymultu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] a=new int[10][10];
      for (int i=0;i<10;i++){
    	  for(int j=0;j<10;j++){
    		  a[i][j]=(i+1)*(j+1);
    	  }
      }
      
     //print
      for (int i=0;i<10;i++){
    	  for(int j=0;j<10;j++){
    		 System.out.print(a[i][j]+" , ");
    	  }
    	  System.out.println("  ");
      }
	}

}
