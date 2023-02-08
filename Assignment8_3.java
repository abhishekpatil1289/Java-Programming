import java.util.*;

public class Assignment8_3 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();
    int iMult = 1;

    for (int i = 1; i <= iNo; i++) {
      iMult = iMult * i;
    }
    System.out.println(iMult);
  }
}
