
import java.util.Scanner;
public class one {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("int a: ");
 int x = iScanner.nextInt();
 System.out.printf("double a: ");
 double y = iScanner.nextDouble();
 System.out.printf("%s + %f = %h", x, y, x + y);
 iScanner.close();
  }

}
