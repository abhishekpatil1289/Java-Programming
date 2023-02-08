import java.util.Scanner;

public class Assignment6_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First name");
        int str = sobj.nextInt();
        System.out.println("Enter Second name");
        int str2 = sobj.nextInt();

        if (str == str2) {
            System.out.println( "Equal");
        }
        else
        {
            System.out.println("not Equal");
        }
    }
}
