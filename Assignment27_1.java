import java.util.Scanner;

class CheckChar
{
    public void Check(String str, char ch)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                System.out.println("True");   
                return;
            }
        }
        System.out.println("False");
    }
}

public class Assignment27_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sobj.nextLine();
        System.out.println("Enter the Character to find");
        char ch = sobj.next().charAt(0);

        CheckChar chk = new CheckChar();

        chk.Check(str,ch);
    }
}
