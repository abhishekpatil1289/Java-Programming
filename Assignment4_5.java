import java.util.Scanner;

/**
 * Assignment4_5
 */
public class Assignment4_5 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number ");
        int iNo = sobj.nextInt();
        int iOdd = 0;
        int iEven = 0;

        for (int i = 1; i < iNo; i++)
        {
            if (iNo % i == 0)
            {
                iEven = iEven  + i;
                System.out.println(i+"\t");
            }
            else
            {
                iOdd = iOdd + i ;  
            }
        }
        System.out.println(iOdd-iEven+"\t"+iEven+"\t"+iOdd);
    }
}