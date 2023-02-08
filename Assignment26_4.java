import java.util.Scanner;

public class Assignment26_4 
{
    static void toggleChars(char str[]) 
    {
        for (int i = 0; i < str.length; i++) 
        {
            if (str[i] >= '0' && str[i] <= '9')
              {
                System.out.print(str[i]);
              }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        char ch[] = sobj.next().toCharArray();
        toggleChars(ch);
    }
}
