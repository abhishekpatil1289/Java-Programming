import java.util.Scanner;

class PrintStar
{
    void PrintS(String str)
    {
        char[] ch = str.toCharArray();
        int cut = 0;
        for (int i = 0; i < ch.length; i++)
        {
            for (int j = 0; j < ch.length - cut; j++) 
            {
                System.out.print(ch[j]+"\t");
            }    
            cut++;
            System.out.println();
        }
    }
}

public class Assignment38_2
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
