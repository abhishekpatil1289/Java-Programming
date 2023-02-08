import java.util.Scanner;

class PrintStar
{
    void PrintS(String str)
    {
        char[] ch = str.toCharArray();
        int iCnt = str.length();
        int chS = 0;
        int increment = -1;
        System.out.println("iCnt is "+iCnt);

        for (int i = 0; i < iCnt * 2; i++)
        {
            increment++;
            if (increment < iCnt)
            {
                for (int j = 0; j <= increment; j++) 
                {
                    System.out.print(ch[j]+"\t");
                } 
            }
            else
            {
                chS++;
                for (int j = 0; j < ch.length - chS; j++) 
                {
                    System.out.print(ch[j]+"\t");
                } 
            }
            System.out.println();
        }
    }
}

public class Assignment38_5
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
