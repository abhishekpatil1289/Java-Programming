import java.util.*;

class Radius {
    int iNo = 0;
    int Arr[];
    Scanner sobj = new Scanner(System.in);

    public Radius() {
        System.out.println("How many many elements you want to store");
        iNo = sobj.nextInt();
        Arr = new int[iNo];
    }

    public void Accept() {
        System.out.println("Enter Elememts");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }
        System.out.println("elements are");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + "\t");
        }
        System.out.println();
    }

    public void Function() {
        int iSum = 0, iEven = 0;
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] % 2 == 0)
            {
                iSum = iSum + Arr[i];
            } 
            else 
            {
                iEven = iEven + Arr[i];
            }
        }
        System.out.println(iSum-iEven);
    }
}

public class Assignment14_1 {
    public static void main(String[] args) {

        Radius robj = new Radius();

        robj.Accept();

        robj.Function();
    }
}
