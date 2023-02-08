import java.util.Scanner;

class StringDemo
{

    public void Demo(String str1, String str2,int iNo)
    {   
        char[] A = str1.toCharArray();
        char[] B = str2.toCharArray();
        if (iNo > str2.length())
        {
            System.out.println(str1 +" "+str2);
            return;
        }
        else
        {
            for (int i = 0; i < iNo; i++)
            {
                if (A[i] != B[i])
                {
                    System.out.println("Not Equal");
                    return;
                }
            }
            System.out.println("Equal");
        }
    }
}

public class Assignment35_3
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