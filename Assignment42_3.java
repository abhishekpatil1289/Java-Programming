import java.util.Scanner;

public class Assignment42_3 {
    
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

        // Reverse
        for (int i = 0; i < Combination.length / 2; i++) {
            int temp = Combination[i];
            Combination[i] = Combination[Combination.length - 1 - i];
            Combination[Combination.length - 1 - i] = temp;
        }

        for (int i = 0; i < Combination.length; i++)
        {
            System.out.print(Combination[i]+"\t");   
        }
    }
}