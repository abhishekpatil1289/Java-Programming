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
        int iCnt = 0, iOdd = 0;
        System.out.println("Answer is :-");
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 11) {
                iCnt++;
            }
        }
        System.out.println(iCnt);
    }
}

public class Assignment15_4 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        Arrayx Ax = new Arrayx();
        System.out.println("How many Elements you want to enter");
        int iNo = sobj.nextInt();

        Ax.Accept(iNo);
        Ax.Even();
    }
}