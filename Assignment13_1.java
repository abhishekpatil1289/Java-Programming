import java.util.*;

class Radius {
    int iNo = 0;

    public Radius(int iSize) {
        iNo = iSize;
    }

    int iSum = 0;

    public void Function() {
        int iDigit = 0;
        int iCnt = 0;
        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if (iDigit % 2 == 0)
            {
                iCnt++;                
            }
            iNo = iNo /10;
        }
        System.out.println(iCnt);
    }
}

public class Assignment13_1
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter Number");
        int iNo = sobj.nextInt();

        Radius robj = new Radius(iNo);

        robj.Function();
    }
}
