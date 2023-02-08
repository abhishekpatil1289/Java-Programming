import java.util.Scanner;

class PrintStar
{
    void PrintS(String str)
    {
        char[] ch = str.toCharArray();
        int iCnt = -1;
        int chS = 1;

        for (int i = 0; i < ch.length - 1; i++)
        {
            iCnt++;
            for (int j = 0; j < ch.length; j++) 
            {
                if (j<=i)
                {
                    System.out.print(ch[j]+"\t");
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

public class Assignment39_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String i = sobj.nextLine();

        PrintStar Pobj = new PrintStar();
        Pobj.PrintS(i);

    }
}
