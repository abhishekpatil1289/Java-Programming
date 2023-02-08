import java.util.Scanner;

public class Assignment6_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your name");
        int str = sobj.nextInt();

        if (str > 100) {
            System.out.println( "Grater");
        }
        else
        {
            System.out.println("not Grater");
        }
    }
}
