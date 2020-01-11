
public class IOZad3 {

	/**
	 * 3. Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт
и мениджър. Мениджърът има име, фамилия и телефонен номер.
Напишете програма, която чете информацията за компанията и нейния
мениджър и я отпечатва след това на конзолата.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firm="BGL ltd";
		String adrFirm="Sofia bulgaria 3";
		String telFirm="098-99-89-99";
		String faxFirm="02-60-18-347";
		String wwwFirm="BGL.com";
		
		String managerFirmFirstName="Mario";
		String managerFirmLastName="Super";
		String managerFirmTel="099-99-99-99";
		System.out.printf("Даните за фирма \"%s \" с адрес %s  \n  Възможности за контакти \n    " +
				"  телефон :%s%n" +
				"     Факс :%s%n" +
				"      web-site : %s%n  %n %n ", firm,adrFirm,telFirm,faxFirm,wwwFirm);
		System.out.printf("Фирмата се управлява от %s %s , за контакти по личния му телефон е  %s", managerFirmFirstName,managerFirmLastName,managerFirmTel);
		

	}

}
