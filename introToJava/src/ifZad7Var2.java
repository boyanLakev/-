
public class ifZad7Var2 {

	/**
	 * 7. ������ �� ������� ���� �����. �������� ��������, ����� ������
����� ������������ �� ���, ����� ���� ���� 0. �������:
- ��� �� ������ ������� {-2, -1, 1}, ������ �� -1 � 1 � 0.
- ��� �� ������ ������� {3, 1, -7}, ���� ������������ ��� ���� 0.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=-1;
		int c=1;
		int d=-7;
		System.out.println( "���������  �����  �� !  ");
		System.out.print( "{  ");
		System.out.print( a);
		System.out.print( " ,  ");
		System.out.print( b);
		System.out.print( " ,  ");
		System.out.print( c);
		System.out.println( " }  ");
		int nalichnost=0;
		// ����� �������
		if(a+b==0){
			System.out.printf( " %d � %d e 0 ",a,b);
			nalichnost++;
			System.out.println(" "); 
			
		}
		if(a+c==0){
			System.out.printf( " %d � %d e 0 ",a,c);
			nalichnost++;
			System.out.println(" "); 
		}
		if(a+d==0){
			System.out.printf( " %d � %d e 0 ",a,c);
			nalichnost++;
			System.out.println(" "); 
		}
		// ����� �������
		if(b+c==0){
			System.out.printf( " %d � %d e 0 ",b,c);
			nalichnost++;
			System.out.println(" "); 
		}
		if(b+d==0){
			System.out.printf( " %d � %d e 0 ",b,d);
			nalichnost++;
			System.out.println(" "); 
		}
		// ����� �������
		if(c+d==0){
			System.out.printf( " %d � %d e 0 ",b,d);
			nalichnost++;
			System.out.println(" "); 
		}
		//
		if (nalichnost==0){
			System.out.println("���� ������������ ��� ���� 0.");
			
		}
		
		
		
		

	}

}
