
public class arrayZad3 {

	/**
	 * 3. �� �� ������ ��������, ����� �������� ��� ������ �� ��� char
�������������� (����� �� �����) � ��������� ��� �� ����� � ��-���� �
���������������� ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] mat1={'a','$','r','g','d','7','f'};
		char[] mat2={'b','$','R','g','D','7','f'};
		String m1="";
		String m2="";
		for (int i=0;i<mat1.length;i++){
			m1+=mat1[i];
		}
		for (int i=0;i<mat2.length;i++){
			m2+=mat2[i];
		}
		if (m1.equalsIgnoreCase(m2)){
					System.out.println(" masivite �� �������");
			}else{
					int korect=m1.compareToIgnoreCase(m2);
				    if (korect <0){
				    	System.out.println("mat1 e �� ����� �������������� �� ���2 ");
				    }else{
				    	System.out.println("mat1 e �� ����� �������������� �� ���2 ");
				    }
				    
				}
		
		
		}
	}


