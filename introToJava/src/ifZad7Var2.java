
public class ifZad7Var2 {

	/**
	 * 7. Дадени са няколко цели числа. Напишете програма, която намира
онези подмножества от тях, които имат сума 0. Примери:
- Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
- Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=-1;
		int c=1;
		int d=-7;
		System.out.println( "Наличните  данни  са !  ");
		System.out.print( "{  ");
		System.out.print( a);
		System.out.print( " ,  ");
		System.out.print( b);
		System.out.print( " ,  ");
		System.out.print( c);
		System.out.println( " }  ");
		int nalichnost=0;
		// Първи елемент
		if(a+b==0){
			System.out.printf( " %d и %d e 0 ",a,b);
			nalichnost++;
			System.out.println(" "); 
			
		}
		if(a+c==0){
			System.out.printf( " %d и %d e 0 ",a,c);
			nalichnost++;
			System.out.println(" "); 
		}
		if(a+d==0){
			System.out.printf( " %d и %d e 0 ",a,c);
			nalichnost++;
			System.out.println(" "); 
		}
		// Втори елемент
		if(b+c==0){
			System.out.printf( " %d и %d e 0 ",b,c);
			nalichnost++;
			System.out.println(" "); 
		}
		if(b+d==0){
			System.out.printf( " %d и %d e 0 ",b,d);
			nalichnost++;
			System.out.println(" "); 
		}
		// Трети елемент
		if(c+d==0){
			System.out.printf( " %d и %d e 0 ",b,d);
			nalichnost++;
			System.out.println(" "); 
		}
		//
		if (nalichnost==0){
			System.out.println("няма подмножества със сума 0.");
			
		}
		
		
		
		

	}

}
