import java.util.Scanner;
public class rimDecConvert {

	/**
	 * 11. Да се напише програма, която преобразува римските числа в арабски.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("въведете римско число :");
		String rim=input.nextLine();
		char[] rimChar=new char[rim.length()];
		for (int i=0;i<rim.length();i++){
			rimChar[i]=rim.charAt(i);
			System.out.println(rimChar[i]);
		}
		int[] rimNum=new int[rim.length()];
		boolean bul=true;
		for (int i=0;i<rim.length();i++){
			switch(rimChar[i]){
			   case 'i':rimNum[i]=1;break;
			   case 'I':rimNum[i]=1;break;
			   case 'v':rimNum[i]=5;break;
			   case 'V':rimNum[i]=5;break;
			   case 'x':rimNum[i]=10;break;
			   case 'X':rimNum[i]=10;break;
			   case 'l':rimNum[i]=50;break;
			   case 'L':rimNum[i]=50;break;
			   case 'c':rimNum[i]=100;break;
			   case 'C':rimNum[i]=100;break;
			   case 'd':rimNum[i]=500;break;
			   case 'D':rimNum[i]=500;break;
			   case 'm':rimNum[i]=1000;break;
			   case 'M':rimNum[i]=1000;break;
			   default:bul=false;
				
			}
			
		}
		
		//
		int dec=0;
		for (int i=0;i<rim.length();i++){
			if (i<rim.length()-1){
					if (rimNum[i]<rimNum[i+1]){
						rimNum[i]*=-1;
					}
			}
			dec=dec+rimNum[i];
		}
		System.out.println (" десетично е :"+dec);
		
	}

}
