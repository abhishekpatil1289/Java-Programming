import java.util.Scanner;

class PrintStar
{
    void PrintS(String str)
    {
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++)
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

public class Assignment39_3
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
