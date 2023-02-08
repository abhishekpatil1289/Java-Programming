import java.util.Scanner;

class PrintStar
{
    void PrintS(int Row,int Col)
    {
        for (int i = 1; i <= Row; i++)
        {
            for (int j = 1; j <= Col; j++)
            {
                if (j % 2 != 0)
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print("#"+"\t");
                }
            }
            System.out.println();   
        }
    }
}

public class Assignment37_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Row number");
        int i = sobj.nextInt();

        System.out.println("Enter the Col number");
        int j = sobj.nextInt();

        PrintStar Pobj = new PrintStar();

        Pobj.PrintS(i, j);
    }
}
