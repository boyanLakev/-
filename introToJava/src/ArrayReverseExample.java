
import java.util.Arrays;
public class ArrayReverseExample {
public static void main(String[] args) {
int[] array = new int[] { 1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15 };
System.out.println(Arrays.toString(array));
// Get array size
int length = array.length;
// Declare and create the reversed array
int[] reversed = new int[length];
// Initialize the reversed array
for (int index = 0; index < length; index++) {
reversed[length - index - 1] = array[index];
}
// Print the reversed array
System.out.println(Arrays.toString(reversed));
}
}