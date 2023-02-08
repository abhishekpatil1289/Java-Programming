import java.util.Scanner;
import java.util.Scanner;

public class Assignment7_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo = sobj.nextInt();
        
            
        for (int i = 0; i < iNo; i++)
        {
           if (i % 2 != 0) 
           {
             System.out.print(i+"\t");
           }    
        }
    }
}
