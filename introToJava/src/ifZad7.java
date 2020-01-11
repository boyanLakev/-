
public class ifZad7 {

	/**
	 * 7. Дадени са няколко цели числа. Напишете програма, която намира
онези подмножества от тях, които имат сума 0. Примери:
- Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
- Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int broi=0;
		int[] myList = {1,7,4, -2, 8,5,2,-8,-7};
		System.out.println( "Наличните  данни  са !  ");
		System.out.print( "{  ");
		for (int i = 0; i < myList.length; i++) {
	         System.out.print(myList[i] + " , ");
	      }
		System.out.print( "  }");
		System.out.println( " ");
		for (int i = 0; i < myList.length; i++) {
			for (int j = i+1; j < myList.length; j++) {
					if (j!=i){
						if (myList[i]+myList[j]==0){
							broi=broi+1;
							System.out.println(broi+".  Сумата от "+myList[i] + " и "+myList[j] + " e равна на 0 ");
							System.out.println(" Т.е елемента  "+i+"  и елемента  "+j + " cумата им  e равна на 0 ");
						}
					}
			         
			      }
	         
	      }
		if (broi==0){
			System.out.println("няма подмножества със сума 0.");
		}
		
	}

}
