import java.util.Scanner;

class Arrayx {
    Scanner sobj = new Scanner(System.in);

    void Accept(int Arr[]) {
        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }
    }
}

public class Assignment41_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of 1st array");
        int size1 = sobj.nextInt();
        int[] Arr1 = new int[size1];

        Arrayx Aarr = new Arrayx();
        Aarr.Accept(Arr1);

        System.out.println("\nEnter the size of 2st array");
        int size2 = sobj.nextInt();
        int[] Arr2 = new int[size2];

        Aarr.Accept(Arr2);

        int Combination[] = new int[Arr1.length + Arr2.length];

        for (int i = 0; i < Arr1.length; i++) 
        {
            Combination[i] = Arr1[i];
        }


        int iCounter = 0;

        for (int i = Arr1.length; i < Combination.length; i++)
        {
            Combination[i] = Arr2[iCounter];
            iCounter++;
        }

        System.out.println("combination elememts");
        for (int i = 0; i < Combination.length; i++) 
        {
            System.out.print(Combination[i]+"\t");
        }

    }
}