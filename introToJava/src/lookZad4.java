
public class lookZad4 {

	/**
	 * Напишете програма, която отпечатва всички възможни карти от стандартно тесте без джокери (имаме 52 карти: 4 бои по 13 карти).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] card={"2","3","4","5","6","7","8","9","10","Вале","Дама","Поп","Асо"} ;
		String[] boq={"Спатия","Каро","Купа","Пика"};
		for (String c:card){
			for(String b:boq){
				System.out.println(c+" "+b);
			}
			
		}
	}

}
