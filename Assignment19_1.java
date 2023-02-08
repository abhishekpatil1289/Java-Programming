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
        for (int i = 0; i < iRow; i++)
        {
            for (int j = 0; j < iCol; j++)
            {
                System.out.print("*\t");    
            }
            System.out.println();
        }
    }
}

public class Assignment19_1 {
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
