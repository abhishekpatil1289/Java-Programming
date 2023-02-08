import java.util.Scanner;

/**
 * Assignment1_5
 */

class Print {
    Scanner sobj = new Scanner(System.in);
    int iNo = 0;
    int iNo2 = 0;

    Print() {
        System.out.println("Enter First Number");
        iNo = sobj.nextInt();
        System.out.println("Enter Second Number");
        iNo2 = sobj.nextInt();
    }

    public void PrintStar() {
        for (int i = 0; i < iNo2; i++) {
            System.out.print(iNo + "\t");
        }
    }
}

public class Assignment2_4
{

    public static void main(String[] args) {
        Print pobj = new Print();

        pobj.PrintStar();
    }
}