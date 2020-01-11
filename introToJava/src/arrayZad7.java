
public class arrayZad7 {

	/**
	 *7. Сортиране на масив означава да подредим елементите му в нарастващ
(намаляващ) ред. Напишете програма, която сортира масив. Да се
използва алгоритъма "Selection sort".
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =  { 64, 25, 12, 22, 11 };
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

	}
}
