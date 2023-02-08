import java.util.Scanner;

class Print {
    Scanner sobj = new Scanner(System.in);
    int iNo = 0;

    Print() {
        System.out.println("Enter First Number");
        iNo = sobj.nextInt();
    }

    public void PrintStar() {
        for (int i = 1; i <= (iNo/2); i++) 
        {
            if ((iNo % i == 0) && (i % 2 == 0))
            {
                System.out.print(i+"\t");
            }
        }
    }
}

public class Assignment3_3 {
    public static void main(String[] args) {
        Print pobj = new Print();

        pobj.PrintStar();
    }
}