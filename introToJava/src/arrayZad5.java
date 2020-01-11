
public class arrayZad5 {

	/**
	 * 5. Напишете програма, която намира максималната редица от нарастващи елементи в масив.
	 *  Пример: {3, 2, 3, 4, 2, 2, 4}  {2, 3, 4}.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={3, 2, 3, 4, 5, 2, 4,5,6,7,8,9,10,11,1,2,3,4,5};
		int longest=0;
		int charest=1;
		int charter=1;
			for (int i=0;i<=array.length-2;i++){
				for (int j=i+1;j<=array.length-1;j++){
					if (array[i]+j-i!=array[j]){
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
			System.out.printf("елемент %d с стойност %d се нараства %d пъти",longest,array[longest],charest)	;
			System.out.println("  ");
			System.out.print(" { ");
			for (int i=longest;i<=charest+longest;i++){
				System.out.print(array[i]+" , ");
		         }
			System.out.print(" } ");
		}
		

	}