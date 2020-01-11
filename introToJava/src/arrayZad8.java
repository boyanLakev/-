
public class arrayZad8 {

	/**
	 * 8. Напишете програма, която намира най-често срещания елемент в
масив. Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3}  4 (5 times).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] array= arr;
        //ot zad 7
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
			//ot zad 4
				             int longest=0;
				     		int charest=1;
				     		int charter=1;
				     			for (int i=0;i<=array.length-1;i++){
				     				for (int j=i;j<=array.length-1;j++){
				     					if (array[i]!=array[j]){
				     						break;
				     					    }
				     					charter++;
				     				   }
				     				if (charter>charest){
				     					charest=charter;
				     					longest=i;
				     				    }	
				     			   charter=0;
				     			}
				     			// massiv raspechatvane
				     			System.out.println("  ");
				     			System.out.print(" { ");
				     			for (int i=0;i<=array.length-1;i++){
				     				System.out.print(array[i]+" , ");
				     		         }
				     			System.out.print(" } ");
				     			System.out.println("  ");
				     			//raspechatvane na dalgiq element
				     			System.out.printf(" стойност %d се повтаря %d пъти",array[longest],charest)	;
				     			System.out.println("  ");
				     			System.out.print(" { ");
				     			for (int i=longest;i<=charest+longest-1;i++){
				     				System.out.print(array[i]+" , ");
				     		         }
				     			System.out.print(" } ");
				             
				             
				             
	}

}
