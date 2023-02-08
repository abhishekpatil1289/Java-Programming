import java.util.Scanner;

public class Assignment6_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First name");
        int str = sobj.nextInt();
        System.out.println("Enter Second name");
        int str2 = sobj.nextInt();
        System.out.println("Enter Third name");
        int str3 = sobj.nextInt();

        int iAns = str*str2*str3;

        System.out.println(iAns);
       
    }
}
