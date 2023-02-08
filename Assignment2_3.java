import java.util.Scanner;

/**
 * Assignment1_5
 */

class Print {
    Scanner sobj = new Scanner(System.in);
    int iNo = 0;

    Print() {
        System.out.println("Enter the Number");
        iNo = sobj.nextInt();
    }

    public void PrintStar() {
        for (int i = 0; i < iNo; i++) {
            System.out.print("*" + "\t");
        }
    }
}

public class Assignment2_3 {

    public static void main(String[] args) 
    {
        Print pobj = new Print();
    
        pobj.PrintStar();
    }
}