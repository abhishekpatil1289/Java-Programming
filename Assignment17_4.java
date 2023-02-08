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

    public int iDigit(int iNo)
    {
        int iDig = 0;
        int iCnt = 0;
        while (iNo != 0)
        {
            iCnt++;
            iDig = iNo % 10;
            iNo =  iNo /10;
        }
        return iCnt;
    }

    public void Even() {
        
        System.out.println("Answer is :-");

        for (int i = 0; i < Arr.length; i++)
        {
           if (iDigit(Arr[i]) == 3)
           {
                System.out.println(Arr[i]);
           }
        }
    }
}

public class Assignment17_4
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