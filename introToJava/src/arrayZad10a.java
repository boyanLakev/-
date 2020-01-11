import java.util.Scanner;
public class arrayZad10a {

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
	        for (int i=0;i<n;i++){
	        	for (int j=0;j<n;j++){
	        		array[j][i]=broi;
	        		broi++;
	        	}
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