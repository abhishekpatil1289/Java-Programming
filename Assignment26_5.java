import java.util.Scanner;

class ax {
    public void toggleChars(String str) 
    {
        int iCnt = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ' ') 
            {
                iCnt++;
            }
        }
        System.out.println(iCnt);
    }
}

public class Assignment26_5 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        String ch = sobj.nextLine();
        ax x = new ax();
        x.toggleChars(ch);
    }
}
