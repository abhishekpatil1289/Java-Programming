import java.util.Scanner;

import javax.xml.transform.Source;

class ArrayCombine
{
    int Arr[];
    ArrayCombine(int a[])
    {
        Arr=a;
    }

    Scanner sobj  = new Scanner(System.in);

    public void Accept()
    {
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i]= sobj.nextInt();
        }
        System.out.println();
    }

    public void Pallindrom()
    {
        int temp = 0;
        int end = Arr.length-1;

        while (temp < end)
        {
            if (Arr[temp]!= Arr[end])
            {
                System.out.println("not Pallindrom");
            }
            temp++;
            end--;
        }
        System.out.println("palindrom");
    }
}

public class Assignment42_5 {
    
    public static void main(String[] args) 
    {
        int size1 = 0;
        
        Scanner sobj  = new Scanner(System.in);
        
        
        System.out.println("enter the range of First Array");
        size1 = sobj.nextInt();
        int Arr1[] = new int[size1];
        
        ArrayCombine Aobj = new ArrayCombine(Arr1);
        Aobj.Accept();
        Aobj.Pallindrom();
    }
}