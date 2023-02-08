import java.util.Scanner;

class PrintStar
{
    void PrintS(String str)
    {
        char[] ch = str.toCharArray();
        
        
        for (int i = 0; i < ch.length -1; i++)
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
    }
}

public class Assignment39_5
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