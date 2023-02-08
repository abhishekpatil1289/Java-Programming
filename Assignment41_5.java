import java.util.Scanner;

class Arrayx
{
    Scanner sobj = new Scanner(System.in);

    void Accept(int Arr[])
    {
        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void Display(int []Arrz)
    {
        int iSum = 0;
        for (int i = 0; i < Arrz.length; i++)
        {
            iSum = iSum + Arrz[i];
        }
        System.out.println(iSum);
    }
}

public class Assignment41_5 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of 1st array");
        int size1 = sobj.nextInt();
        int []Arr1 = new int[size1];
        
        Arrayx Aarr = new Arrayx();
        Aarr.Accept(Arr1);
        
        
        System.out.println("\nEnter the size of 2st array");
        int size2 = sobj.nextInt();
        int []Arr2 = new int[size2];

        Aarr.Accept(Arr2);
        
        System.out.println("Addition of first array");
        Aarr.Display(Arr1);
        System.out.println("Addition of Second array");
        Aarr.Display(Arr2);

    }
}