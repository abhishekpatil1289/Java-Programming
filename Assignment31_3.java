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
        int iCnt = 0, iCnt2 = 0;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
            {
                iCnt++;
            }
            else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
            {
                iCnt2++;
            }
        }
        System.out.println(iCnt-iCnt2);
    }
}

public class Assignment31_3 {
    public static void main(String[] args)
    {
        System.out.println();
        Marvellous Ax = new Marvellous();
        Ax.CountCapital();
    }
}
