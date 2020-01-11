import java.util.Arrays;
public class minMaxOborot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int min,max;
       int[] ob={200,11,111,222,333,444,555,666,777,222,999,567};
       min=0;
       
       max=0;
       System.out.println(Arrays.toString(ob));
       for (int i=0;i<ob.length;i++){
    	   if (ob[min] >ob[i]){
    		   min=i;
    		   System.out.println(min);
    	   }
    	   if (ob[max] <ob[i]){
    		   max=i;
    		   System.out.println(max);
    	   }
    	   
       }
       ob[min]=ob[max]+ob[min];
       ob[max]=ob[min]-ob[max];
       ob[min]=ob[min]-ob[max];
      
       System.out.println(Arrays.toString(ob));
	}

}
