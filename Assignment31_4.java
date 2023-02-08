import java.util.Scanner;

class Marvellous
{
    Scanner sobj = new Scanner(System.in);
    String str1;
    public Marvellous()
    {
        System.out.println("Enter the Character");
        str1 = sobj.nextLine();
    }

    public void CountCapital()
    {
        for (int i = 0; i < str1.length(); i++)
        {
            if ((str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' && str1.charAt(i) == 'o' || str1.charAt(i) == 'u') || (str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' && str1.charAt(i) == 'O' || str1.charAt(i) == 'U'))
            {
                System.out.println("True");
                return;
            }
            System.out.println("False");
        }
    }
}

public class Assignment31_4
{
    public static void main(String[] args)
    {
        System.out.println();
        Marvellous Ax = new Marvellous();
        Ax.CountCapital();
    }
}
