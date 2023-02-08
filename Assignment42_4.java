import java.util.Scanner;

class ArrayCombine
{
    Scanner sobj  = new Scanner(System.in);

    public void Accept(int Arr[],int size)
    {
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i]= sobj.nextInt();
        }
    }
    
}


public class Assignment42_4 {
    
    public static void main(String[] args) 
    {
        int size1 = 0, size2 = 0;
        
        Scanner sobj  = new Scanner(System.in);
        ArrayCombine Aobj = new ArrayCombine();
        
        
        System.out.println("enter the range of First Array");
        size1 = sobj.nextInt();
        int Arr1[] = new int[size1];

        for (int i = 0; i < Arr1.length; i++)
        {
            Arr1[i] = sobj.nextInt();    
        }
        System.out.println();


        System.out.println("enter the range of Second Array");
        size2 = sobj.nextInt();
        int Arr2[] = new int[size2];

        for (int i = 0; i < Arr2.length; i++)
        {
            Arr2[i] = sobj.nextInt();
        }
        System.out.println();
        

        int Combination[] = new int[Arr1.length + Arr2.length];
        for (int i = 0; i < Arr1.length; i++)
        {
            Combination[i] = Arr1[i];
        }

        int Counter = 0;
        for (int i = Arr1.length; i < Combination.length; i++)
        {
            Combination[i] = Arr2[Counter];
            Counter++;
        }

        for (int i = 0; i < Combination.length; i++)
        {
            System.out.print(Combination[i]+"\t");   
        }
    }
}