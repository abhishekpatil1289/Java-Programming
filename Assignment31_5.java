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
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        
       System.out.println(sb);
    }
}

public class Assignment31_5
{
    public static void main(String[] args)
    {
        System.out.println();
        Marvellous Ax = new Marvellous();
        Ax.CountCapital();
    }
}
