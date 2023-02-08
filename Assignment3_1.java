import java.util.Scanner;

class Print {
    Scanner sobj = new Scanner(System.in);
    int iNo = 0;

    Print() {
        System.out.println("Enter First Number");
        iNo = sobj.nextInt();
    }

    public void PrintStar() {
        for (int i = 1; i <= iNo; i++) 
        {
            System.out.print(i * 2+"\t");
        }
    }
}

public class Assignment3_1 {
    public static void main(String[] args) {
        Print pobj = new Print();

        pobj.PrintStar();
    }
}