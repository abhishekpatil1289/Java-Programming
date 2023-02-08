import java.util.Scanner;

public class Assignment6_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Total marks");
        float str = sobj.nextFloat();
        System.out.println("Enter marks you obtain");
        float str2 = sobj.nextFloat();

        float iRet = ((str2/str)*100);

        System.out.println("Percentage "+iRet);
       
    }
}
