import java.util.Scanner;


class reversex
{
    public void reverseStr(String str)
    {
        char ch[] = str.toCharArray();
        char temp;

        for (int i = 0; i < ch.length; i++)
        {
            char car = ch[i];
            if (Character.isLowerCase(car))
            {
                ch[i] = Character.toUpperCase(car);
            }
            else if (Character.isUpperCase(car))
            {
                ch[i] = Character.toLowerCase(car);
            }
        }
        

        for (int i = 0; i < ch.length/2; i++)
        {
                        temp = ch[i];
                       ch[i] = ch[ch.length - i -1];
        ch[ch.length - i -1] = temp;
        }
        String reversed = new String(ch);   
        System.out.println(reversed);
    }
}

public class Assignment35_4 {

    public static void main(String[] args) {
        Scanner sobj  = new Scanner(System.in);
        System.out.println("enter string to reverse");
        String str = sobj.nextLine();

        reversex rx = new reversex();

        rx.reverseStr(str);
    }
}
