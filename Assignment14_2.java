import java.util.Scanner;

/**
 * Assignment14_2
 */

class Arrayx {
    int iNo = 0;
    Scanner sobj = new Scanner(System.in);
    int Arr[];

    public Arrayx() {
        System.out.println("How many Elements you want to store");
        iNo = sobj.nextInt();
        Arr = new int[iNo];
    }

    public void Accept()
    {
        System.out.println("Enter the Elemets");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Elelments in Array are");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();
    }

    public void DivByFive()
    {
        System.out.println("Elements which are divisible by 5 are");
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 5 == 0)
            {
                System.out.print(Arr[i]+"\t");
            }
        }
    }



}

public class Assignment14_2 {

    public static void main(String[] args) {

    Arrayx Ax = new Arrayx();

    Ax.Accept();

    Ax.DivByFive();

    }
}