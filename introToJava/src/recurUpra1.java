
public class recurUpra1 {

	/**
	 * 1. Напишете програма, която генерира и отпечатва всички комбинации с
повторение на k елемента над n-елементно множество.
Примерен вход:
n = 3
к = 2
Примерен изход:
(1 1), (1 2), (1 3), (2 2), (2 3), (3 3)
	 */
	 public static int n=3;
	 public static int k=3;
	 public static int[] loops;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops = new int[n];
		loop(0);
	}
	
	public static void loop(int curent){
		if (curent==n){
			printLoops();
			return;
			}
		for (int i=0;i<k;i++){
			
		}
	}
		
	public static void printLoops() {
			for (int i = 0; i < n; i++) {
			System.out.printf("%d ", loops[i]);
			}
			System.out.println();
			}
		
	}


