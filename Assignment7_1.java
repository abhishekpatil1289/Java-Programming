import java.util.Scanner;

public class Assignment7_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        for (int i = 0; i < iNo; i++)
        {
            System.out.print("#   *   ");    
        }
    }
}
