
public class arrayZad {

	/**
	 * 15. Напишете програма, която сортира целочислен масив по алгоритъма
"quick sort".
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("програма, която сортира целочислен масив по алгоритъма \"quick sort\".");
		int[] array={5,89,3,44,34,66,1,6,77,88,98,5,4,7,46,12,35,15,19};
		int left=0;
		int right=array.length;
		int middle=right/2;
		int[] leftArray=new int[middle+1];
		int[] rightArray=new int[right - middle ];
		int tem;
		// left array create
		for (int i=0;i<middle;i++){
			leftArray[i]=array[i];
			System.out.print(leftArray[i]+" ,");
		}
		// right array create
		System.out.println(" ,");
		
		for (int  i=0;i<right-middle;i++){
			rightArray[i]=array[i+middle];
			
			System.out.print(rightArray[i]+" ,");
		}
		//for sort left
		for (int i=1;i<middle;i++){
			for (int j=0;j<i;j++){
				if (leftArray[j]>leftArray[i]){
					 tem=leftArray[j];
					leftArray[j]=leftArray[i];
					leftArray[i]=tem;
				}
			}
		
		}
		//print left
		System.out.println(" ,");
		for (int i=0;i<middle;i++){
			
			System.out.print(leftArray[i]+" ,");
		}
		
		// for sort right
		for (int i=1;i<right - middle-1;i++){
			for (int j=0;j<i;j++){
				if (rightArray[j]>rightArray[i]){
					 tem=rightArray[j];
					 rightArray[j]=rightArray[i];
					 rightArray[i]=tem;
				}
			}
		
		}
		// print right
			System.out.println(" ,");
		
					for (int  i=0;i<right-middle;i++){
			
			
							System.out.print(rightArray[i]+" ,");
					}
		
		//Add left and right
					int leftI=0;
					int rightI=0;
					tem=0;
		 while (leftI<right && rightI< right - middle-1){
			 if(leftArray[leftI]<rightArray[rightI]){
				 tem=leftArray[leftI];
				 if (leftI<middle){
					 leftI++;
					 }
			 }
			 if(leftArray[leftI]>=rightArray[rightI]){
				 tem=rightArray[rightI];
				if(rightI<right-middle){
					right++;
					
				}
			 }
			 array[i]=tem;
			 
		 	}			

		//print sort array
		 
		 System.out.println(" ,");
		 System.out.print(" {");
			for (int  i=0;i<right;i++){
	
	
					System.out.print(array[i]+" ,");
			}

			 System.out.print(" }");
		
		
		
		
		
		
		
		
}

}
