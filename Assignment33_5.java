import java.util.Scanner;

import javax.swing.Icon;

class Marvellous
{
   public void CheckDigit(int iNo)
    {
        int iDigit = 0, iCnt = 0, iOdd = 0; 
        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if (iDigit % 2 == 0)
            {
                iCnt = iCnt + iDigit;
            }
            else if (iDigit % 2 != 0)
            {
                iOdd = iDigit + iOdd;
            }
            iNo = iNo / 10;
        }
        System.out.println(iCnt - iOdd);
    }
}

public class Assignment33_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iSize;
        System.out.println("Enter the number");
        iSize = sobj.nextInt();
        Marvellous fn = new Marvellous();
        fn.CheckDigit(iSize);
    }
}
