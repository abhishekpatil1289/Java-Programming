import java.util.Scanner;

import javax.swing.Icon;

class Marvellous
{
   public void CheckDigit(int iNo)
    {
        int iDigit = 0, iCnt = 1; 
        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if (iDigit == 0)
            {
                iDigit = 1;
            }
            iCnt = iDigit * iCnt;
            iNo = iNo / 10;
        }
        System.out.println(iCnt);
    }
}

public class Assignment33_4
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
