import java.util.Scanner;

class ArrayProg
{
    Scanner sobj = new Scanner(System.in);

    public int Minmum(int Arr[])
    {
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int first = Arr[0];

        for (int i = 0; i < Arr.length; i++)
        {
            if (first > Arr[i])
            {
                first = Arr[i];
            }    
        }
        return first;
    }
}

public class Assignment42_2 {

    public static void main(String[] args)
    {
        ArrayProg Aobj = new ArrayProg();
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the range of first arrray");
        int size = sobj.nextInt();
        int Arr1[] = new int[size];

        System.out.println("Enter the range of Second array");
        int Size2 = sobj.nextInt();
        int Arr2[] =  new int[Size2];


        System.out.println("enter the element in First Array");
        int Ret = Aobj.Minmum(Arr1);
        System.out.println("Minimun number in First array is " + Ret);

        System.out.println("enter the element in Second Array");
        Ret = Aobj.Minmum(Arr2);
        System.out.println("Minimun number in Second array is " + Ret);
    }
}