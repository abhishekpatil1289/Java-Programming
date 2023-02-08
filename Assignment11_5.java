import java.util.Scanner;
import java.util.Scanner;

class Radius {
    int iNo = 0, iNo2 = 0;

    public Radius(int iSize, int iSize2) {
        iNo = iSize;
        iNo2 = iSize2;
    }

    int iSum = 0;

    public void Function() {

        for (int i = iNo2; i >= iNo; i--) {
            System.out.print(i + "\t");
        }
    }
}

public class Assignment11_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter Number");
        int iNo = sobj.nextInt();
        System.out.println("enter Number");
        int iNo2 = sobj.nextInt();

        Radius robj = new Radius(iNo, iNo2);

        robj.Function();
    }
}
