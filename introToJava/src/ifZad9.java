import java.util.Scanner;
public class ifZad9 {

	/**
	 * 9. �������� ��������, ����� ����������� ������ ����� � ���������
[0..999] � �����, ������������ �� ����������� ������������.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������, ����� �� ������ ����� (0-9), �������� ���� ����, \r\n" + 
				" ������� ����� �� ������� �� ��������� ����.");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "  ");
		System.out.println( " �������� ����� �� 0 �� 999 ");
		int chislo=input.nextInt();
		int abc=chislo;
		int c=abc%10;
		int ab=abc/10;
		int b=ab%10;
		int a=ab/10;
		int bc=abc%100;
		String chisloBul=null;
		switch (a) {
				    case 0:chisloBul=" ";break;
					case 1:chisloBul="���";break;
					case 2:chisloBul="������";break;
					case 3:chisloBul="������";break;
					case 4:chisloBul="������������";break;
					case 5:chisloBul="���������";break;
					case 6:chisloBul="����������";break;
					case 7:chisloBul="�����������";break;
					case 8:chisloBul="����������";break;
					case 9:chisloBul="�����������";break;
					default:
	        }
		if (b!=0 && a!=0){
			chisloBul=chisloBul+" "+"�"+" ";
			
		}
		if (b==1){
			switch (bc) {
		    case 10:chisloBul=chisloBul+"�����";break;
			case 11:chisloBul=chisloBul+"����������";break;
			case 12:chisloBul=chisloBul+"����������";break;
			case 13:chisloBul=chisloBul+"����������";break;
			case 14:chisloBul=chisloBul+"�������������";break;
			case 15:chisloBul=chisloBul+"����������";break;
			case 16:chisloBul=chisloBul+"�����������";break;
			case 17:chisloBul=chisloBul+"������������";break;
			case 18:chisloBul=chisloBul+"�����������";break;
			case 19:chisloBul=chisloBul+"������������";break;
		default:
	}
		
	}else{
		switch (b) {
		    case 0:;break;
			
			case 2:chisloBul=chisloBul+"��������";break;
			case 3:chisloBul=chisloBul+"��������";break;
			case 4:chisloBul=chisloBul+"�����������";break;
			case 5:chisloBul=chisloBul+"��������";break;
			case 6:chisloBul=chisloBul+"���������";break;
			case 7:chisloBul=chisloBul+"����������";break;
			case 8:chisloBul=chisloBul+"���������";break;
			case 9:chisloBul=chisloBul+"����������";break;
		    default:
         }
		
		if (c!=0&& b!=0){
			chisloBul=chisloBul+" "+"�"+" ";
		}
		switch (c) {
			    case 0:;break;
			    case 1:chisloBul=chisloBul+"����";break;
				case 2:chisloBul=chisloBul+"���";break;
				case 3:chisloBul=chisloBul+"���";break;
				case 4:chisloBul=chisloBul+"������";break;
				case 5:chisloBul=chisloBul+"���";break;
				case 6:chisloBul=chisloBul+"����";break;
				case 7:chisloBul=chisloBul+"�����";break;
				case 8:chisloBul=chisloBul+"����";break;
				case 9:chisloBul=chisloBul+"�����";break;
			    default:
		}
			
		
	}
			if (chislo==0){
				chisloBul="����";
			}
			
	System.out.println(chisloBul);	
			
		
			
			
			
			}

	}


