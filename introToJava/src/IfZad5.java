import java.util.Scanner;
public class IfZad5 {
/*
 * 5. Напишете програма, която при въвеждане 
 * на коефициентите (a, b и c) на квадратно 
 * уравнение: ax2 + bx + c , изчислява и 
 * извежда неговите реални корени.

 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5. Напишете програма, която при въвеждане"
				+ " на коефициентите (a, b и c) "
				+ "на квадратно уравнение: ax2 + bx + c ,"
				+ " изчислява и извежда неговите реални корени.\r\n" + 
				"");
		Scanner input=new Scanner(System.in);
		System.out.println( "  ");
		System.out.println( "Въведете коефициента а :  ");
		double a=input.nextFloat();
		System.out.println( "Въведете коефициента b :  ");
		double b=input.nextFloat();
		System.out.println( "Въведете коефициента c :  ");
		double c=input.nextFloat();
		double det=b*b-4*a*c;
		double x1;
		double x2;
		if (det<0){
			System.out.println( " Уравнението няма решение  ");
		}else {
			if (det==0) {
				System.out.println( " Уравнението има едно  решение : ");
				x1=((-1)*b)/(2*a);
				System.out.printf("X = %f ",x1);
			}else {
				System.out.println( " Уравнението има две  решение : ");
				x1=((-1)*b+Math.sqrt(det))/(2*a);
				System.out.printf("X 1 = %f %n",x1);
				System.out.println( " и второто   решение : ");
				x2=((-1)*b+Math.sqrt(det))/(2*a);
				System.out.printf("X 2 = %f %n",x2);
				
				
			}
		}

	}

}
