import java.util.Scanner;

class Alpha
{
    public void CheckChar(String ch)
    {  
        
        for (int i = 0; i < ch.length(); i++)
        {
            if (ch.length() == 'a' || ch.charAt(i) == 'e' || ch.charAt(i) == 'i' ||
                ch.charAt(i) == 'o' || ch.charAt(i) == 'u' ||  ch.charAt(i)== 'A' ||
                ch.charAt(i) == 'E' || ch.charAt(i) == 'I' || ch.charAt(i) == 'O' ||
                ch.charAt(i) == 'U')
            {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}

public class Assignment25_4
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
