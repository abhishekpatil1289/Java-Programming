import java.util.Scanner;


class DigitRev
{
    public void Reverse(int Arr[])
    {
        
        for (int i = 0; i < Arr.length; i++)
        {
            int Digit = 0, Holder = 0;
            
            while (Arr[i] != 0)
            {
                Digit = Arr[i] % 10;
                Holder = (10 * Holder) + Digit;
                Arr[i] = Arr[i] / 10;
            }
            System.out.print(Holder+"\t");
        }
    }
    
} 

class Assignment43_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
      
        System.out.println("enter the range of arrays");
        int range = sobj.nextInt();

        int Arr[] = new int[range];

        System.out.println("enter the elements");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        DigitRev dobj = new DigitRev();
        
        dobj.Reverse(Arr);

        // System.out.println(Arr);
    }
}