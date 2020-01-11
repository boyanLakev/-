public class arrayZad4 {

	/**
	 *4. Напишете програма, която намира максималната редица от еднакви
елементи в масив. Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1}  {2, 2, 2}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={2, 1, 1, 2, 3, 3, 2, 2, 2, 1};
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
			System.out.printf("елемент %d с стойност %d се повтаря %d пъти",longest,array[longest],charest)	;
			System.out.println("  ");
			System.out.print(" { ");
			for (int i=longest;i<=charest+longest-1;i++){
				System.out.print(array[i]+" , ");
		         }
			System.out.print(" } ");
		}
		

	}



