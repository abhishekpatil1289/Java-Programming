import java.util.Scanner;


/**
 * Assignment3_5
 */

class wovels
{
    char a;

    wovels(char s)
    {
        a = s;
    }

    public boolean wovelsreturn()
    {
        boolean flag = false;

        if (( a == 'a') || (a == 'e')|| (a == 'i')|| (a == 'o')|| (a == 'u')) 
        {
            flag = true;
        }
        return flag;
    }
}

public class Assignment3_5 
{
    public static void main(String srg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        wovels w = new wovels(ch);

        boolean bRet = w.wovelsreturn();
        if (bRet ==  true)
        {
            System.out.println("True");
        } else 
        {
            System.out.println("False");
        }
    }    
}