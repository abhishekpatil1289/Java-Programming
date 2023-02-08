import java.util.Scanner;

/**
 * Assignment4_2
 */
public class Assignment4_2 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        for (int i = iNo ; i > 0; i--) 
        {
            if (iNo % i == 0)
            {
                System.out.print(i+"\t");    
            }
        }
    }
}