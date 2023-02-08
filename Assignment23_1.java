import java.util.Scanner;

class Alpha
{
    public void CheckChar(char ch)
    {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }
}

public class Assignment23_1 {
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
