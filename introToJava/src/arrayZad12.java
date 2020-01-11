import java.util.Scanner;
public class arrayZad12 {

	/**
	 * 12. Да се напише програма, която създава масив с всички букви от
латинската азбука. Да се даде възможност на потребител да въвежда
дума от конзолата и в резултат да се извеждат индексите на буквите
от думата.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("въведете  някъкъв низ :");
		String word = input.nextLine();
		char[] wordChar= new char[word.length()];
		for (int i=0;i<word.length();i++){
			wordChar[i]=word.charAt(i);
			System.out.println(wordChar[i]+" - "+((int)wordChar[i]));
		}

	}

}
