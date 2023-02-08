import java.util.Scanner;

class Alpha
{
    public void CheckChar(int ch)
    {   
        System.out.println("Decimal\tOcat\tHexa");
        System.out.printf("%d\t%o\t%h",ch,ch,ch);
    }
}

public class Assignment24_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Character");
        int ch = sobj.next().charAt(0);

        Alpha bet = new Alpha();

        bet.CheckChar(ch);

    }
}
