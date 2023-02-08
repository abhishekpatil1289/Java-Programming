import java.util.Scanner;

class Pattern
{
    int iRow = 0, iCol = 0;
    public Pattern(int iSize, int iSize2)
    {
        iRow = iSize;
        iCol = iSize2;
    }

    public void PatternDesign()
    {
        int iCnt = 0;
        for (int i = iRow; i > 0; i--)
        {
            iCnt = i;
            for (int j = 1; j <= iCol; j++)
            {   
                if (iCnt > 0)
                {
                    System.out.print("*\t");
                    iCnt--;
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}

public class Assignment22_2
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Row numbe");
        int iNo = sobj.nextInt();

        System.out.println("Enter Column number");
        int iNo2 = sobj.nextInt();

        Pattern Print = new Pattern(iNo,iNo2);

        Print.PatternDesign();

    }
}
