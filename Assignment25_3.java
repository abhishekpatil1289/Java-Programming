import java.util.Scanner;

class Alpha
{
    public void CheckChar(String ch)
    {  
        int Big = 0;
        int Small = 0;
        for (int i = 0; i < ch.length(); i++)
        {
            if (ch.charAt(i)>= 'a' && ch.charAt(i) <= 'z')
            {
                Small++;
            }
            if (ch.charAt(i)>= 'A' && ch.charAt(i) <= 'Z')
            {
                Big++;
            }
        }
        System.out.println("Difference between small and big "+(Small-Big));
    }
}

public class Assignment25_3
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
