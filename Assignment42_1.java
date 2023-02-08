import java.util.Scanner;

class ArrayProg
{
    int Sum = 0, Sum2 =0;
    public void Summation(int Arr1[],int Arr2[])
    {
        for (int i = 0; i < Arr1.length; i++)
        {
            Sum = Sum + Arr1[i];
        }
        
        for (int i = 0; i < Arr2.length; i++)
        {
            Sum2 = Sum2 + Arr2[i];
        }
        System.out.printf("Differenc of Array1 and Array2 = %d",Sum-Sum2);
    }
}

public class Assignment42_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the range of array\n");
        int Size = sobj.nextInt();

        int Arr1[] = new int[Size];

        System.out.println("enter the element in first array");
        for (int i = 0; i < Arr1.length; i++)
        {
            Arr1[i] = sobj.nextInt();
        }

        System.out.println("enter the range of second array\n");
        int Size2 = sobj.nextInt();

        int Arr2[] = new int [Size2];
        System.out.println("enter the elements in second arrays");
        for (int i = 0; i < Arr2.length; i++)
        {
            Arr2[i] = sobj.nextInt();
        }

        ArrayProg Aobj = new ArrayProg();

        Aobj.Summation(Arr1, Arr2);

    }

}
