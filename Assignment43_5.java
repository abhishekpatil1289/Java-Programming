import java.util.Scanner;


class DClass
{
    public void Markshit(float Arr[])
    {
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] < 35)
            {
                System.out.println("Fail :(");
            } 
            else if (Arr[i] < 50)
            {
                System.out.println("Pass Class");
            } 
            else if (Arr[i] < 60)
            {
                System.out.println("Second Class");
            } 
            else if (Arr[i] < 70)
            {
                System.out.println("First Class");
            } 
            else if (Arr[i] > 70)
            {
                System.out.println("First Class with Distinction");
            } 
        }
    }
} 

class Assignment43_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
      
        System.out.println("enter the range of arrays");
        int range = sobj.nextInt();

        float Arr[] = new float[range];

        System.out.println("enter the Character elements");

        for (int i = 0; i < range; i++)
        {
            Arr[i] = sobj.nextFloat();
        }   

        DClass dobj = new DClass();
        
        dobj.Markshit(Arr);
    }
}