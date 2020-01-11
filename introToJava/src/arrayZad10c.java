import java.util.Scanner;
public class arrayZad10c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Въведете n");
		int n=input.nextInt();
		//int n=10;
        int[][] array=new int [n][n];
        int broi=1;
        int base=n-1;
        int j ;
        int i;
        int rol;
        int col;
        // po y axis
	        for ( rol=n-1;rol>=0;rol--){
	        	array[rol][0]=broi;
	        	broi++;
	        	j=rol;
	        	i=0;
	        	while(j<base) {
	        		j++;
	        		i++;
	        		array[j][i]=broi;
	        		broi++;
	        	  }
	        }
	        
	        for ( col=1;col<=n-1;col++){
	        	array[0][col]=broi;
	        	broi++;
	        	j=col;
	        	i=0;
	        	while(j<base) {
	        		j++;
	        		i++;
	        		array[i][j]=broi;
	        		broi++;
	        	  }
	        }
	       // po x axis
        //razpechatvane
	        for ( i=0;i<n;i++){
	        	for ( j=0;j<n;j++){
	        		System.out.print(array[i][j]+"   ");
	        		if (array[i][j]<10){
	        			System.out.print(" ");
	        		}
	        	}
	        	System.out.println(" ");
	        }
        
	}

}