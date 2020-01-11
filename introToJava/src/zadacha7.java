import java.util.Scanner;
public class zadacha7 {

	/**
	 * 7. Силата на гравитационното поле на луната е приблизително 17% от
	*това на земята. Напишете програма, която да изчислява тежестта на
 	*човек на луната, по дадената тежест на земята.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Възведете килограмите на човека     na ZEMQta");
		float teglo=input.nextInt();
		float tegloLuna=teglo*0.17f;
		System.out.println("Теглото на човека които тежи "+teglo+ "килограма на земята , на  луната ще тежи "+tegloLuna);
		
		
		

	}

}
