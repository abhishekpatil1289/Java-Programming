import java.util.Scanner;

public class Assignment26_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                str=str.toLowerCase();
            }
        }
        System.out.println(str);
    }
}
