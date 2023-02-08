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
        int iEven = 0;
        while (iNo != 0)
        {
            iDigit = iNo % 10;
            if (iDigit % 2 == 0)
            {
                iEven = iEven + iDigit;
            }
            else
            {
                iCnt = iCnt + iDigit;
            }
            iNo = iNo /10;
        }
        System.out.println(iEven-iCnt);
    }
}

public class Assignment13_5
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter Number");
        int iNo = sobj.nextInt();
        
        Radius robj = new Radius(iNo);

        robj.Function();
    }
}
