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

    public int CheckDiff()
    {
        int iSum = 0, iSum2 = 0;
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] % 2 == 0)
            {
                iSum = iSum + Arr[i];
            }
            else if (Arr[i] % 2 != 0) 
            {
                iSum2 = iSum2 + Arr[i];
            }
        }
        return iSum-iSum2;
    }
}

public class Assignment32_1 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("How many elements you want to store");
        int iSize = sobj.nextInt();
        Function fn = new Function(iSize);
        fn.Accept();
        int iRet = fn.CheckDiff();
        System.out.println("Difference is "+iRet);
    }
}
