import java.util.Scanner;

/**
 * InnerAssignment1_2
 */
class Print
{
    Scanner sobj = new Scanner(System.in);
    
    public void PrintFun ()
    {
        System.out.println("Enter the Number");
        int ivalue1 = sobj.nextInt();
        
        for (int i = 0; i < ivalue1; i++) {
            System.out.println("Marvellous");
        }
    }

}
public class Assignment1_2 {

    public static void main(String[] args)
    {

        Scanner sonj = new Scanner(System.in);

        Print obj = new Print();

        obj.PrintFun();

    }
}