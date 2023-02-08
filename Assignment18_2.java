import java.lang.reflect.Array;
import java.util.Scanner;

class ArrayA
{
    int iNo;
    public ArrayA(int iSize)
    {
        iNo = iSize;
    }

    public void Pattern()
    {
        for (int i = iNo; i > 0; i--)
        {
        
            System.out.print(i+" # ");
        }
    }
}

public class Assignment18_2 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        ArrayA Aa = new ArrayA(iNo);
        Aa.Pattern();
    }
}
