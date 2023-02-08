import java.util.Scanner;
import java.util.Scanner;

public class Assignment7_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo = sobj.nextInt();
        
            
        for (int i = -iNo; i <= iNo; i++)
        {
            System.out.print(i+"\t");    
        }
    }
}
