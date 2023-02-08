import java.util.Scanner;

import javax.imageio.ImageIO;

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

    public void ChecknNumber()
    {
        System.out.println("Elements are :- ");
        int Mult = 1;
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] % 2 != 0)
            {
                Mult = Mult * Arr[i];
            }
        }
        
        if (Mult == 1)
        {
            Mult = 0;
            System.out.println(Mult);
        }
        else
        {
            System.out.println(Mult);  
        }
    }
}

public class Assignment34_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("How many elements you want to store");
        int iSize = sobj.nextInt();
        
        
        Function fn = new Function(iSize);
        fn.Accept();

        fn.ChecknNumber();
    }
}
