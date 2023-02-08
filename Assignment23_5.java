import java.util.Scanner;

class Alpha
{
    public void CheckChar(char ch)
    {
        if (ch == 'a' || ch == 'A')
        {
            System.out.println("Your Exam at 7 AM");
            return;
        }
        else if (ch == 'B' || ch == 'b')
        {
            System.out.println("Your Exam at 8:30 AM");
            return;
        }
        else if (ch == 'C' || ch == 'c')
        {
            System.out.println("Your Exam at 9:20 AM");
            return;
        }
        else if (ch == 'D' || ch == 'd')
        {
            System.out.println("Your Exam at 10:30 AM");
            return;
        }


        System.out.println("No division Exist");
    }
}

public class Assignment23_5
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
