import java.util.Scanner;



//  simple and understandable version 2

/**
 * Assignment3_4
 */
public class Assignment3_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the character");
        char s = sobj.next().charAt(0);

        if ((s >= 'a') && (s <= 'z'))
        {
                s = Character.toUpperCase(s);
        }
        else if ((s >= 'A') && (s <= 'Z'))
        {
            s = Character.toLowerCase(s);
        }

        System.out.println(s);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// class Print {
//     Scanner sobj = new Scanner(System.in);
//     String str ;

//     Print() 
//     {
//         System.out.println("Enter Character");
//         str = sobj.nextLine();
//     }

//     public void PrintStar() 
//     {
//         // int icnt = 0;
//         // char Arr[] = str.toCharArray();
//         for (int i = 0; i < 1; i++)
//         {
//             if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
//             {
//                 System.out.println(str.toUpperCase());
//             }
//             else if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
//             {
//                 System.out.println(str.toLowerCase());
//             }
//         }
//     }
// }

// public class Assignment3_4
// {
//     public static void main(String[] args) 
//     {
        
//         Print pobj = new Print();

//         pobj.PrintStar();
//     }
// }
