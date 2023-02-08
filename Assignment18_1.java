import java.util.Scanner;

public class Assignment18_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();
        char ch = 'A';

        for (int i = 0; i < iNo; i++)
        {
            System.out.println(ch);
            ch++;
        }
    }
}
