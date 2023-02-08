import java.util.Scanner;

class Uppar
{
    public void Pattern(char Arr[])
    {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = Character.toLowerCase(Arr[i]);
            }
            System.out.print(Arr[i]+"\t");
        }
    }
}

class Assignment44_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int range = sobj.nextInt();

        char Arr[] = new char[range];

        System.out.println("enter cahracrer ");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.next().charAt(0);
        }

        Uppar uobj = new Uppar();

        uobj.Pattern(Arr);
    }

}