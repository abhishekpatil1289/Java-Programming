import java.util.Scanner;

class Uppar
{
    Scanner sobj = new Scanner(System.in);
    public void Pattern(int Arr[])
    {
        for (int i = 0; i < Arr.length; i++)
        {
            for (int j = 0; j < Arr[i]; j++)
            {
                System.out.print("*\t"); 
            }   
        }
    }
}

class Assignment44_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int range = sobj.nextInt();

        int Arr[] = new int[range];

        System.out.println("enter Numbers in array :- ");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Uppar uobj = new Uppar();

        uobj.Pattern(Arr);
    }

}