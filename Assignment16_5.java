import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.ISO;

import java.util.Scanner;

/**
 * Assignment14_3
 */

class Arrayx {
    int Arr[];
    Scanner sobj = new Scanner(System.in);

    public void Accept(int iNo) 
    {
        Arr = new int[iNo];
        System.out.println("Enter Elements in Array");
        
        for (int i = 0; i < Arr.length; i++) 
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Even() {
        int iCnt = 1;
        System.out.println("Answer is :-");

        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] % 2 != 0)
            {
                iCnt = Arr[i] * iCnt;
            }
        }
        System.out.println(iCnt);
    }
}

public class Assignment16_5 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        Arrayx Ax = new Arrayx();
        System.out.println("How many Elements you want to enter");
        int iNo = sobj.nextInt();

        Ax.Accept(iNo);
        Ax.Even();
    }
}