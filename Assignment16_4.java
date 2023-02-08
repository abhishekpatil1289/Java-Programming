import java.util.Scanner;
import java.util.Scanner;

/**
 * Assignment14_3
 */

class Arrayx {
    int Arr[];
    Scanner sobj = new Scanner(System.in);

    public void Accept(int iNo) {
        Arr = new int[iNo];
        System.out.println("Enter Elements in Array");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Even() {
        System.out.println("Start From");
        int iNo2 = sobj.nextInt();

        System.out.println("End From");
        int iNo3 = sobj.nextInt();

        System.out.println("Answer is :-");

        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] > iNo2 && Arr[i] < iNo3)
            {
               System.out.println(Arr[i]);
            }
        }
    }
}

public class Assignment16_4
{

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        Arrayx Ax = new Arrayx();
        System.out.println("How many Elements you want to enter");
        int iNo = sobj.nextInt();

        Ax.Accept(iNo);
        Ax.Even();
    }
}