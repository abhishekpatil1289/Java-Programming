import java.util.Scanner;

/**
 * Assignment4_3
 */

 class NonFact
 {
    int iValue = 0;
    NonFact(int iNo)
    {
        iValue = iNo;
    }

    public void Fact()
    {
        int iSum = 0;
        for (int i = 1; i <= (iValue); i++)
        {
            if (iValue % i != 0)
            {
                iSum = iSum + i;
            }    
        }
        System.out.println(iSum);
    }
 }

public class Assignment4_4 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo = sobj.nextInt();

        NonFact n = new NonFact(iNo);

        n.Fact();
    }
}