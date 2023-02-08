import java.util.*;

public class Assignment8_5 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();
    int iMult = 1;

    for (int i = 10; i > 0; i--) {
      System.out.println(iNo*i);
    }
  }
}
