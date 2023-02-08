import java.util.Scanner;

class PrintStar
{
    void PrintS(String str)
    {
        char[] ch = str.toCharArray();
        int iCnt = str.length();
        int cut = -1;

        for (int i = ch.length; i > 0 ; i--)
        {
            for (int j = 0; j < ch.length; j++) 
            {
                if (i > j)
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

        for (int i = 1; i < ch.length; i++)
        {
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

public class Assignment39_4
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