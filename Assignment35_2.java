import java.util.Scanner;

class StringDemo
{
    public void Demo(String str1, String str2)
    {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        for (int i = 0; i < b.length; i++)
        {
            if (a[i] != b[i])
            {
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }
}

public class Assignment35_2 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String");
        String str2 = sobj.nextLine();

        StringDemo sd = new StringDemo();

        sd.Demo(str1,str2);
    }
}