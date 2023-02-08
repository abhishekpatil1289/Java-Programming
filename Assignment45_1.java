import java.util.Arrays;
import java.util.Scanner;

class RotationX {
    char Arr1[], Arr2[];

    RotationX(char a[], char b[]) {
        Arr1 = a;
        Arr2 = b;
    }

    public void CheckRotation()
    {
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        
        for (int i = 0; i < Arr1.length; i++)
        {
            if(Arr1[i] != Arr2[i])
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("Strings is anagram");
    }
}

public class Assignment45_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the string");
        String str1 = sobj.nextLine();

        System.out.println("enter the Second string");
        String str2 = sobj.nextLine();

        char Arr[] = str1.toCharArray();
        char Arr2[] = str2.toCharArray();

        RotationX robj = new RotationX(Arr, Arr2);

        robj.CheckRotation();
    }
}
