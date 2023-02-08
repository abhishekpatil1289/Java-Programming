
/////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Assignment25_5 {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");

        String str = sobj.nextLine();

        StringBuilder sb = new StringBuilder();
        
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
    }
}


/////////////////////////////////////////////////////////////////////////////////////

// import java.io.*;
// import java.util.Scanner;

// public class Assignment25_5 {
//     public static void main(String[] args) {

//         Scanner sobj = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String str = sobj.nextLine();
//         String nstr = "";
//         StringBuilder sb = new StringBuilder();
        
//         char ch;

//         for (int i = 0; i < str.length(); i++)
//         {
//             ch = str.charAt(i); // extracts each character
//             nstr = ch + nstr; // adds each character in front of the existing string
//         }
//         System.out.println("Reversed word: " + nstr);
//     }
// }




