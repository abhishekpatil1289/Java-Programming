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
        int iCnt = 1;
        int iCnt2 = -1;
        for (int i = 1; i <= iRow; i++)
        {
            for (int j = 1; j <= iCol; j++)
            {
              if (i % 2 == 0)
                {

                    System.out.print("\t"+" "+iCnt);
                    iCnt++;
                }
                else
                {
                    System.out.print("\t"+iCnt2); 
                    iCnt2--; 
                }
            }
            iCnt = 1;
            iCnt2 = -1;
            System.out.println();
        }
    }
}

public class Assignment21_4
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
