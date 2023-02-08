import java.util.Scanner;

class Arrayx
{
    Scanner sobj = new Scanner(System.in);

    void Accept(int Arr[])
    {
        System.out.println("Enter the Elements in Array");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void Display(int []Arrz)
    {
        for (int i = 0; i < Arrz.length; i++)
        {
            if (Arrz[i] % 2 == 0)
            {
                System.out.print(Arrz[i]+"\t");
            }
        }
        System.out.println();
    }
}

public class Assignment41_2 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of 1st array");
        int size1 = sobj.nextInt();
        int []Arr1 = new int[size1];
        
        Arrayx Aarr = new Arrayx();
        Aarr.Accept(Arr1);
        
        
        System.out.println("\nEnter the size of 2st array");
        int size2 = sobj.nextInt();
        int []Arr2 = new int[size2];

        Aarr.Accept(Arr2);
        
        Aarr.Display(Arr1);
        Aarr.Display(Arr2);

    }
}


// import java.util.Scanner;

// public class Assignment41_1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the first array: ");
//         int size1 = sc.nextInt();
//         int[] array1 = new int[size1];

//         System.out.println("Enter the elements of the first array: ");
//         for (int i = 0; i < size1; i++) {
//             array1[i] = sc.nextInt();
//         }

//         System.out.print("Enter the size of the second array: ");
//         int size2 = sc.nextInt();
//         int[] array2 = new int[size2];

//         System.out.println("Enter the elements of the second array: ");
//         for (int i = 0; i < size2; i++) {
//             array2[i] = sc.nextInt();
//         }

//         ArrayPrinter printer = new ArrayPrinter();
//         printer.printArray(array1);
//         printer.printArray(array2);
//     }
// }

// class ArrayPrinter {
//     void printArray(int[] array) {
//         for (int i = 0; i < array.length; i++) {
//             System.out.print(array[i] + " ");
//         }
//         System.out.println();
//     }
// }
