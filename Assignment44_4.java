import java.util.Scanner;

class Uppar
{
    public void Difference(char Arr[])
    {
        int Cnt = 0, CntSmall = 0;
        
        for (int i = 0; i < Arr.length; i++) 
        {
            if (Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Cnt++;    
            }
            else if (Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                CntSmall++;    
            }
        }
        System.out.println("Differece between Small and Capatil character is :-");
        System.out.println(Cnt-CntSmall);
    }
}

class Assignment44_4
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

        Uppar uobj = new Uppar();

        uobj.Difference(Arr);
    }

}