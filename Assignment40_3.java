import java.util.Scanner;

class PrintStar
{
    void PrintS(int Row,int Col)
    {
        int First = Col-1;
        int iCnt = Col;
        


        for (int i = 1; i <= Row; i++)
        {
            for (int j = 1; j <= Col; j++) 
            {
                if (i == 1 || i == Row || j == 1 || j == Col || iCnt == j )
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            } 
            iCnt--;
            System.out.println();
        }
    }
}

public class Assignment40_3
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