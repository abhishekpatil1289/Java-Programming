import java.util.Scanner;
import java.util.Set;

class CheckChar
{
    public void Check(String str)
    {
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
    }
}

public class Assignment27_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sobj.nextLine();

        CheckChar chk = new CheckChar();

        chk.Check(str);
    }
}
