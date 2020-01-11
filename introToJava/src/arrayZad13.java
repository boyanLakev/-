import java.util.Scanner;
public class arrayZad13 {

	/**
	 * 13. Да се реализира двоично търсене (binary search) в сортиран
целочислен масив.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////
		////sortirane na masiv
		int[] array =  { 64, 25, 12, 22, 11 ,1,2,3,4,5,6,7,8,34,43,64,867,86,9,9,90};
		// print array
		System.out.print( " { ");
		for (int i = 0; i < array.length; i++){ 
		       
            System.out.print(array[i] + " , ");
	    }
		System.out.print(  " } ");
		
		// sorted
        for (int i = 0; i < array.length-1; i++) {
               for (int j = i + 1; j < array.length; j++){
	                if (array[i] > array[j]){ // swap items
	                
	                    int tmp = array[i];
	                    array[i] = array[j];
	                    array[j] = tmp;
	                }
               }
        }
     // print sorted array
        System.out.println(  "  ");
        System.out.print(  " { ");
        for (int i = 0; i < array.length; i++){ 
       
            System.out.print(array[i] + " , ");
	    }
        System.out.print(  " } ");
        // имаме сортиран масив 
        // надолу  имаме бинарно търсене на число
        Scanner input=new Scanner(System.in);
        System.out.println("въведете търсения елемент :");
        int element=input.nextInt();
        int left;
        int right;
        int middle;
        boolean result =false;
        while(result= true){
        	
        	left =0;
        	right=array.length;
        	middle=(left+right)/2;
        	if (element<=array[middle]){
        		right=middle;
        	}
        	if (element<=array[middle]){
        		left=middle;
        	}
        	if()
        	
        }
        


	}

}
