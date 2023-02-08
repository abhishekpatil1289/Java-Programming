import java.util.Scanner;

class StringDemo
{

    public void Demo(String str1, String str2,int iNo)
    {   
        char line1[] = str2.toCharArray();
        char[] ch = new char[line1.length];
        if (iNo > str2.length())
        {
            System.out.println(str1 +" "+str2);
            return;
        }
        else
        {
            System.out.print(str1 +" ");
            for (int i = 0; i < line1.length; i++)
            {
                System.out.print(line1[i]);
                if(i == iNo)
                {
                    return;
                }
            }
        }
    }
}

public class Assignment35_1 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String");
        String str2 = sobj.nextLine();

        System.out.println("enter the number from contact string ");
        int iNo = sobj.nextInt();

        StringDemo sd = new StringDemo();

        sd.Demo(str1,str2,iNo);
    }
}