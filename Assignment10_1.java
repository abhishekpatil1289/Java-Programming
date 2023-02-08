import java.util.Scanner;

import javax.crypto.interfaces.PBEKey;
import javax.print.FlavorException;

class Radius
{
    float iNo = 0;
    public Radius(float iSize)
    {
        iNo = iSize;
    }   

    public void Circul()
    {
        double PI = 3.14;
        double iArea = PI * iNo * iNo;
        System.out.println(iArea);
    }
}

public class Assignment10_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner (System.in);
        System.out.println("enter Number");
        float iNo = sobj.nextFloat();

        Radius robj = new Radius(iNo);

        robj.Circul();
    }
}
