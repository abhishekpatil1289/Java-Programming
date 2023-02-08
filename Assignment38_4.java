import java.util.Scanner;

class PrintStar
{
    void PrintS(String str)
    {
        char[] ch = str.toCharArray();
        int iCnt = str.length();
        int iCnt2 = str.length();
        int chS = 0;
        int iCh = 0;
        int increment = 0;
        System.out.println("iCnt is "+iCnt);

        for (int i = 0; i < iCnt * 2; i++)
        {
            increment++;  
            if (increment <iCnt2+1)
            {
                for (int j = 0; j < ch.length - chS; j++) 
                {
                    System.out.print(ch[j]+"\t");
                } 
                chS++; 
            }
            else
            {
                iCh++;
                for (int s = 0; s < iCh; s++) 
                {
                    System.out.print(ch[s]+"\t");
                }  
            }
            System.out.println();
        }
    }
}

public class Assignment38_4
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
