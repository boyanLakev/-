
public class estimate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] ocenka={6.0f,6f,5f,5.90f,5f,6f,5.35f,5f,5.90f,6,4};
		float min=ocenka[0];
		float max=ocenka[0];
		float		sum=0;
		// min max
		for (int i=0;i<ocenka.length;i++){
			if (min>ocenka[i]){
				min=ocenka[i];
			}
			if (max<ocenka[i]){
				max=ocenka[i];
			}
			sum+=ocenka[i];
		}
		//average
		float average;
		int broi=0;
		average =sum/ocenka.length;
		for (int i=0;i<ocenka.length;i++){
			if (ocenka[i]>=average){
				broi++;
			}
		}
		System.out.printf("��� �������� ������ � %s %n " +
				"��� ������� ������ � %s %n " +
				"������� ����� �� ����� � %s %n" +
				" %d �� ���� ������� ���� ��� ������� ����� ", max,min,average,broi);

	}

}
