import java.util.Scanner;
public class IOZad2 {

	/**
	 * 2. Напишете програма, която чете от конзолата радиуса "r" на кръг и
отпечатва неговия периметър и обиколка.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		Scanner input=new Scanner(System.in);
	    System.out.println("Въведете радиуса на окръжноста");
	    double radius=input.nextDouble();
	    Double perimetar=2*pi*radius;
	    Double area=pi*radius*radius;
	    
	    System.out.printf("окръжноста с радиус %.2f има обиколка  %.2f %nкоето е и периметара на окръжноста " +
	    		"а лицето на същата окръжност е %f  %n %n,всички данни са в същата мерна единица с която сте работили" +
	    		" в при скарването на радиоса", radius,perimetar,area);
	    

	}

}
