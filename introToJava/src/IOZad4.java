import java.util.Scanner;


public class IOZad4 {

	/**
	 * 4. �������� ��������, ����� ���� �� ��������� ��� ���� ����� (integer)
� ���������, ����� ����� ��� ����� ���, ������, �� ��������� �� ��
�������� �� 5 �� � 0.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println("�������� ������� ����� : ");
	    int firstVar=input.nextInt();
	    System.out.println("�������� ������� ����� : ");
	    int secondVar=input.nextInt();
	    int counter=0;
	    for(int i=firstVar; i<secondVar; i++){
	    	if (i%5==0) { 
	    		counter+=1;
	    		System.out.println("Count is: " + i);
	    	}
	    } 	
	    System.out.printf(" ����� ������� %d � %d ,��� %d ���� ����� ������ �� 5",firstVar,secondVar,counter);
            
       

	}

}
