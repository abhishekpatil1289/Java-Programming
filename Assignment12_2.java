import java.util.*;

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
            if (iDigit == 0) {
                System.out.println("Its Contain Zero");
                return;
            }
            iNo = iNo /10;
        }
        System.out.println("No zero available");
    }
}

public class Assignment12_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter Number");
        int iNo = sobj.nextInt();

        Radius robj = new Radius(iNo);

        robj.Function();
    }
}
