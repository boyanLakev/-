import java.util.Scanner;
public class arrayZad12 {

	/**
	 * 12. �� �� ������ ��������, ����� ������� ����� � ������ ����� ��
���������� ������. �� �� ���� ���������� �� ���������� �� �������
���� �� ��������� � � �������� �� �� �������� ��������� �� �������
�� ������.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("��������  ������� ��� :");
		String word = input.nextLine();
		char[] wordChar= new char[word.length()];
		for (int i=0;i<word.length();i++){
			wordChar[i]=word.charAt(i);
			System.out.println(wordChar[i]+" - "+((int)wordChar[i]));
		}

	}

}
