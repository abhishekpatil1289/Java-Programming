import java.util.Scanner;

class Radius
{
    float iNo = 1;
    public Radius(float iSize)
    {
        iNo = iSize;
    }   

    public void Circul()
    {
        double Celcious = 0;
        System.out.println(iNo);
        double Sqfeet = 0.0929;
        Celcious = iNo * Sqfeet;
        System.out.println(Celcious);
    }
}

public class Assignment10_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner (System.in);
        System.out.println("enter Number");
        float iNo = sobj.nextFloat();

        Radius robj = new Radius(iNo);

        robj.Circul();
    }
}
