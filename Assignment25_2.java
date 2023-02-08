import java.util.Scanner;

class Alpha
{
    public void CheckChar(String ch)
    {  
        int iCnt= 0;
        for (int i = 0; i < ch.length(); i++)
        {
            if (ch.charAt(i)>= 'a' && ch.charAt(i) <= 'z')
            {
                iCnt++;
            }
        }
        System.out.println(iCnt);
    }
}

public class Assignment25_2
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
