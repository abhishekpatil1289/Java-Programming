import java.security.Identity;
import java.util.Scanner;

class Radius {
    int iNo = 0;

    public Radius(int iSize) {
        iNo = iSize;
    }

    int iSum = 0;

    public void Function() {
        int iDigit = 0;
        while (iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo /10;
        }
    }
}

public class Assignment12_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter Number");
        int iNo = sobj.nextInt();

        Radius robj = new Radius(iNo);

        robj.Function();
    }
}
