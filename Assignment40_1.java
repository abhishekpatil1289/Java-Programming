import java.util.Scanner;

class PrintStar
{
    void PrintS(int Row,int Col)
    {
        int iCnt = Col;
        
        for (int i = 1; i <= Row; i++)
        {
            for (int j = 1; j <= Col; j++) 
            {
                if (iCnt == j)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            } 
            iCnt--;
            System.out.println();
        }
    }
}

public class Assignment40_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Row number");
        int i = sobj.nextInt();

        
        System.out.println("Enter the Column number");
        int j = sobj.nextInt();

        PrintStar Pobj = new PrintStar();
        Pobj.PrintS(i,j);

    }
}