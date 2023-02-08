import java.util.Scanner;
import java.util.Scanner;

public class Assignment7_5 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();

    for (int i = 1; i <= 5; i++) {

      System.out.print(i * iNo + "\t");
    }
  }
}
