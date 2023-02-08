import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class Palli
{
    public void Palindrom(String str)
    {
        char ch[] = str.toCharArray();
        int[] ascii;
        char temp;
        for (int i = 0; i < ch.length / 2; i++)
        {
                          temp = ch[i];
                         ch[i] = ch[ch.length - i - 1 ];
        ch[ch.length - i - 1 ] = temp;
        }
        System.out.println(ch);
    }
}

public class Assignment35_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        Palli pobj = new Palli();

        pobj.Palindrom(str);

    }
}


// class Assignment35_5 {
//     public static void main(String[] args) {
//       String str = "AbcrRCBa";
  
//       // convert the string to lower case
//       str = str.toLowerCase();
  
//       // reverse the string
//       String reversedStr = new StringBuilder(str).reverse().toString();
  
//       // check if the string is a palindrome
//       if (str.equals(reversedStr)) {
//         System.out.println(str + " is a palindrome.");
//       } else {
//         System.out.println(str + " is not a palindrome.");
//       }
//     }
//   }
  