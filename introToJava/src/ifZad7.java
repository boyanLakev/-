
public class ifZad7 {

	/**
	 * 7. ������ �� ������� ���� �����. �������� ��������, ����� ������
����� ������������ �� ���, ����� ���� ���� 0. �������:
- ��� �� ������ ������� {-2, -1, 1}, ������ �� -1 � 1 � 0.
- ��� �� ������ ������� {3, 1, -7}, ���� ������������ ��� ���� 0.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int broi=0;
		int[] myList = {1,7,4, -2, 8,5,2,-8,-7};
		System.out.println( "���������  �����  �� !  ");
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
							System.out.println(broi+".  ������ �� "+myList[i] + " � "+myList[j] + " e ����� �� 0 ");
							System.out.println(" �.� ��������  "+i+"  � ��������  "+j + " c����� ��  e ����� �� 0 ");
						}
					}
			         
			      }
	         
	      }
		if (broi==0){
			System.out.println("���� ������������ ��� ���� 0.");
		}
		
	}

}
