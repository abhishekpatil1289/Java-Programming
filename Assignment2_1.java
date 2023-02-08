import java.util.Scanner;

/**
 * Assignment1_5
 */

class Print {
    int iSize = 0;

    Print(int iNo) {
        iSize = iNo;
    }

    public void PrintStar() {
        while (iSize != 0) {
            System.out.print("*" + "\t");
            iSize--;
        }
    }
}

public class Assignment2_1 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Print pobj = new Print(iNo);
        pobj.PrintStar();
    }
}