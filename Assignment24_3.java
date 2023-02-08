import java.util.Scanner;

class Alpha
{
    public void CheckChar(char ch)
    {
        if (ch >= 'a' && ch <= 'z')
        {
            for (int i = ch; i >= 'a' ; i--)
            {
                System.out.print(ch+"\t");    
                ch--;
            }
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
           for (int i = ch; i <= 'Z'; i++)
           {
                System.out.print(ch+"\t");
                ch++;
           }
        }
    }
}

public class Assignment24_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        char ch ;
        System.out.println("Enter Character");
        ch = sobj.next().charAt(0);

        Alpha bet = new Alpha();

        bet.CheckChar(ch);

    }
}
