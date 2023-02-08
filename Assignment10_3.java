import java.util.Scanner;

class Radius {
    float iNo = 0;

    public Radius(float iSize) {
        iNo = iSize;
    }

    public void Circul() {
        int kilometer = 1000;
        float Area = iNo * kilometer;
        System.out.println(Area);
    }
}

public class Assignment10_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter Number");
        float iNo = sobj.nextFloat();

        Radius robj = new Radius(iNo);

        robj.Circul();
    }
}
