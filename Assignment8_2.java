import java.util.*;

public class Assignment8_2 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();

    switch (iNo) {
      case 9:
        System.out.println("NINE");
        break;

      case 8:
        System.out.println("EIGHT");
        break;

      case 7:
        System.out.println("SEVEN");
        break;

      case 6:
        System.out.println("SIX");
        break;

      case 5:
        System.out.println("FIVE");
        break;

      case 4:
        System.out.println("FOUR");
        break;

      case 3:
        System.out.println("THREE");
        break;

      case 2:
        System.out.println("TWO");
        break;

      case 1:
        System.out.println("ONE");
        break;

      case 0:
        System.out.println("ZERO");
        break;

      default:
        System.out.println("INVALID VALUE");
        break;
    }
  }
}
