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
        int iCnt = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
            {
                iCnt++;
            }
        }
        System.out.println(iCnt);
    }
}

public class Assignment31_2 {
    public static void main(String[] args)
    {
        System.out.println();
        Marvellous Ax = new Marvellous();
        Ax.CountCapital();
    }
}
