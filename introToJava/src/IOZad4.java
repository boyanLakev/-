import java.util.Scanner;


public class IOZad4 {

	/**
	 * 4. Напишете програма, която чете от конзолата две цели числа (integer)
и отпечатва, колко числа има между тях, такива, че остатъкът им от
деленето на 5 да е 0.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println("Въведете Първото число : ");
	    int firstVar=input.nextInt();
	    System.out.println("Въведете второто число : ");
	    int secondVar=input.nextInt();
	    int counter=0;
	    for(int i=firstVar; i<secondVar; i++){
	    	if (i%5==0) { 
	    		counter+=1;
	    		System.out.println("Count is: " + i);
	    	}
	    } 	
	    System.out.printf(" Между числата %d и %d ,има %d пъти числа кратни на 5",firstVar,secondVar,counter);
            
       

	}

}
