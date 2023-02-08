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
        for (int i = 1; i <= iNo; i++)
        {
        
            System.out.print("#\t"+i+"\t*\t");
        }
    }
}

public class Assignment18_4 {
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        ArrayA Aa = new ArrayA(iNo);
        Aa.Pattern();
    }
}
