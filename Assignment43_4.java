import java.util.Scanner;


class DigitRev
{
    public void Reverse(char Arr[])
    {
        int Cnt = 0;
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Cnt++;
            }
        }
        System.out.println("Capital Characters are :- "+Cnt);
    }
} 

class Assignment43_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
      
        System.out.println("enter the range of arrays");
        int range = sobj.nextInt();

        char Arr[] = new char[range];

        System.out.println("enter the Character elements");

        for (int i = 0; i < range; i++)
        {
            Arr[i] = sobj.next().charAt(0);
        }   

        System.out.println("elements are");
        for (int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        DigitRev dobj = new DigitRev();
        
        dobj.Reverse(Arr);
    }
}