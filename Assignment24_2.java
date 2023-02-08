import java.util.Scanner;

class Alpha
{
    public void CheckChar(char ch)
    {
        
        if (ch >= 'a' && ch <= 'z')
        {
            ch = Character.toUpperCase(ch);
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            ch = Character.toLowerCase(ch);
        }
        System.out.println(ch);
    }
}

public class Assignment24_2
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
