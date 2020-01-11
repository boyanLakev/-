import java.util.Date;
public class concatLoop {
public static void main(String[] args) {
System.out.println(new Date());
String collector = "Numbers: ";
for(int idx = 1; idx <= 60000; idx++) {
collector += idx;
}
System.out.println(collector.substring(0, 1024));
System.out.println(new Date());
}
}