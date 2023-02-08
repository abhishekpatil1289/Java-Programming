import java.util.Scanner;

class CheckChar
{
    public void Check(String str, char ch)
    {
        int iCnt = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                iCnt++;
            }
        }
        System.out.println("Frequency of"+ch+" is "+iCnt);
    }
}

public class Assignment27_2 {
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
