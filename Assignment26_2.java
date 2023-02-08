import java.util.Scanner;

public class Assignment26_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                str=str.toUpperCase();
            }
        }
        System.out.println(str);
    }
}
