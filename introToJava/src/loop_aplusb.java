import java.util.Scanner;
public class loop_aplusb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
      //int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
      //int[] b=a;
		int[] a=new int[20];
		for (int i=0;i<20;i++){
			a[i]=input.nextInt();
		}
		int[] b=new int[20];
		for (int i=0;i<20;i++){
			b[i]=input.nextInt();
		}
      int sum=0;
      for (int i=0;i<20;i++){
    	  sum+=a[i]*b[i];
      }
      System.out.print(" sumata e "+sum);
	}

}
