import java.util.Scanner;

/**
 * Assignment1_5
 */

class Print {
    Scanner sobj = new Scanner(System.in);
    int iNo = 0;

    Print() {
        System.out.println("Enter First Number");
        iNo = sobj.nextInt();
    }

    public void PrintStar() {
        if (iNo % 2 == 0) 
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Not Even");
        }
    }
}

public class Assignment2_5 {

    public static void main(String[] args) {
        Print pobj = new Print();

        pobj.PrintStar();
    }
}