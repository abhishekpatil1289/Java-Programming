import java.util.Scanner;

class Radius {
    float iNo = 0, iNo2 = 0;

    public Radius(float iSize, float iSize2) {
        iNo = iSize;
        iNo2 = iSize2;
    }

    public void Circul() {
        float Area = iNo * iNo2;
        System.out.println(Area);
    }
}

public class Assignment10_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter Number");
        float iNo = sobj.nextFloat();
        System.out.println("enter Number");
        float iNo2 = sobj.nextFloat();

        Radius robj = new Radius(iNo, iNo2);

        robj.Circul();
    }
}
