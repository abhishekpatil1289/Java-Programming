import java.util.Scanner;
import java.util.Scanner;

public class Assignment8_1 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();

    if (iNo < 50) {
      System.out.println("Small");
    } else if (iNo < 100) {
      System.out.println("medium");
    } else if (iNo > 100) {
      System.out.println("large");
    }
  }
}
