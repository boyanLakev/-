import java.util.Scanner;
public class ifZad2 {

	/**
	 *2. �������� ��������, ����� ������� ����� (+ ��� -) �� �������� �� ��� ������ �����, ��� �� �� ��������.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("�������� ������� ����� :");
		float a=input.nextFloat();
		System.out.print("�������� ������� ����� :");
		float b=input.nextFloat();
		if (((a<0)&&(b<0))||(a>=0)&&(b>=0)){
			System.out.printf("+ %f / %f",Math.abs(a),Math.abs(b));
			
		}else{
			System.out.printf("- %f / %f",Math.abs(a),Math.abs(b));
			
		}
	}

}
