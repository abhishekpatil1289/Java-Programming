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

    public void CheckDiff()
    {
        int iSum = 0, iSum2 = 0;
        System.out.println("Divisible by 5 are : - ");
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] % 11 == 0)
            {
                System.out.print(Arr[i]+"\t");
            }
        }
    }
}

public class Assignment32_5 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("How many elements you want to store");
        int iSize = sobj.nextInt();
        Function fn = new Function(iSize);
        fn.Accept();
        fn.CheckDiff();
    }
}
