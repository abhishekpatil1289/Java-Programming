import java.util.Scanner;

class Marvellous
{
    Scanner sobj = new Scanner(System.in);
    int Arr[];

    public Marvellous(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        System.out.println("Enter the Array");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
}

class Function extends Marvellous
{   
    public Function(int iSize)
    {
        super(iSize);
    }

    public void ChecknNumber(int No)
    {
        System.out.println("index is :- ");
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] == No)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}

public class Assignment34_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("How many elements you want to store");
        int iSize = sobj.nextInt();
        
        
        Function fn = new Function(iSize);
        fn.Accept();

        System.out.println("which element you want to find");
        int iSize2 = sobj.nextInt();

        fn.ChecknNumber(iSize2);
    }
}
