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

    public void ChecknNumber(int No,int iNo2)
    {
        System.out.println("Elements are :- ");
        int iCnt = 0;
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] >= No && Arr[i] <= iNo2)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

public class Assignment34_4 //
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("How many elements you want to store");
        int iSize = sobj.nextInt();
        
        
        Function fn = new Function(iSize);
        fn.Accept();

        System.out.println("Enter the starting element ");
        int iSize2 = sobj.nextInt();

        System.out.println("Enter the ending element ");
        int iSize3 = sobj.nextInt();


        fn.ChecknNumber(iSize2,iSize3);
    }
}
