import java.util.Scanner;

public class Assignment7_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        for (int i = iNo; i > 0; i--)
        {
            System.out.print(i+"\t");    
        }
    }
}
