import java.util.Scanner;

class Alpha
{
    public void CheckChar(String ch)
    {  
        int iCnt= 0;
        for (int i = 0; i < ch.length(); i++)
        {
            if (ch.charAt(i)>= 'A' && ch.charAt(i) <= 'Z')
            {
                iCnt++;
            }
        }
        System.out.println(iCnt);
    }
}

public class Assignment25_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Character");
        String ch = sobj.nextLine();

        Alpha bet = new Alpha();

        bet.CheckChar(ch);

    }
}
