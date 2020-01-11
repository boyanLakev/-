import java.util.Scanner;
public class arrayZad10d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Въведете n");
		int n=input.nextInt();
		//int n=10;
		int nn=n;
		int col=0;
		int row=0;
		int rowP=0;
		int colP=0;
        int[][] array=new int [n][n];
        int broi=1;
        
	       while (nn>0){ 
	        	//nadolu
        		for (int i=row;i<nn+row;i++){
	        		array[i][col]=broi;
	        		broi++;
	        		rowP=i;
	        	}
        		row=rowP;
	        	nn=nn-1;
	        	
	        	//nadqsno
	        	col++;
	        	
	        	for (int i=col;i<nn+col;i++){
	        		array[row][i]=broi;
	        		broi++;
	        		colP=i;
	        	}	
	        	col=colP;
	        	
	        	// nagore
	        	row--;
	        	for (int i=row;i>row-nn;i--){
	        		array[i][col]=broi;
	        		broi++;
	        		rowP=i;
	        	}
        		row=rowP;
	        	nn=nn-1;
	        	
	        	// nalqvo
	        	col--;
	        	for (int i=col;i>col-nn;i--){
	        		array[row][i]=broi;
	        		broi++;
	        		colP=i;
	        	}	
	        	col=colP;
	        	row++;
	        	
	        	
	       }
	        	
	        	
        //razpechatvane
	        for (int i=0;i<n;i++){
	        	for (int j=0;j<n;j++){
	        		System.out.print(array[i][j]+"   ");
	        		if (array[i][j]<10){
	        			System.out.print(" ");
	        		}
	        	}
	        	System.out.println(" ");
	        }
        
	}

}