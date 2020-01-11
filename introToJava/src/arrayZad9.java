import java.util.Scanner;
public class arrayZad9 {

	/**
	 * Да се напише програма, която намира последователност от числа в
масив, които имат сума равна на число, въведено от конзолата (ако
има такава). Пример: {4, 3, 1, 4, 2, 5, 8}, S=11  {4, 2, 5}.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] mas={4,3,1,4,2,5,8};
		int[] summas=mas;
		boolean result=false;
		int resulBegin=0;
		int resulPoredni=0;
		System.out.println(" въведете  S ");
		int s=input.nextInt();
		int sum;
		//
		for (int i=0;i<mas.length-1;i++){
			sum=mas[i];
			
			for (int j=i+1;j<mas.length;j++){
				sum=sum+mas[j];
				if (sum==s){
					result=true;
					resulBegin=i;
					resulPoredni=j-i;
					
					break;
				}
				if (result){
					break;
				}
				
			}
			
		}
		// изход
		
		if (result){
			System.out.print(" S =" + s+" :");
			System.out.print(" {");
			for (int i=resulBegin;i<=(resulBegin+resulPoredni);i++){
				System.out.print(mas[i]+" , ");
			}
			System.out.print(" }");
			
			
		}else{
			System.out.println(" няма решения");
		}

	}

}
