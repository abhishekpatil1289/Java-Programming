import java.util.Scanner;

class PrintStar
{
    void PrintS(int Row,int Col)
    {
        int First = Col-1;
        int iCnt = Col;
        int Half = Col/2;
        int Half2 = Half;        
            Half = Half + 1;

        for (int i = 1; i <= Row; i++)
        {
            for (int j = 1; j <= Col; j++) 
            {
                if (i == 1 || j == 1 || j == Col || i == j )
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            } 
            Half2--;
            Half = Half2;
            iCnt--;
            System.out.println();
        }
    }
}

public class Assignment40_5
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