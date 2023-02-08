import java.util.Scanner;

class Uppar
{
    public void UpperCase(char Arr[],char ch)
    {
        int Cnt = 0;
        if (ch >= 'A' && ch <= 'Z')
        {
            for (int i = 0; i < Arr.length; i++) 
            {
               Arr[i] = Character.toUpperCase(Arr[i]);
            }
        }
        else if (ch >= 'a' && ch <= 'z')
        {
            for (int i = 0; i < Arr.length; i++) 
            {
                Arr[i] = Character.toLowerCase(Arr[i]);
            }
        }


        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] == ch)
            {
               Cnt++;
            }
        }
        System.out.print(ch+" Occuars for "+Cnt);
    }
}

class Assignment44_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int range = sobj.nextInt();

        char Arr[] = new char[range];

        System.out.println("enter Characters in array :- ");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.next().charAt(0);
        }
        
        System.out.println("Enter the Char to find Occurance ");
        char ch = sobj.next(".").charAt(0);

        Uppar uobj = new Uppar();

        uobj.UpperCase(Arr,ch);
    }

}