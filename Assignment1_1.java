import java.util.*;

class Division
{

    public int Div(int iNo,int iNo2)
    {
        int iAns = 0;

        iAns= iNo / iNo2;
        return iAns;
    }

}

public class Assignment1_1 {

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        System.out.println("Enter the Number");
        int iNo2 = sobj.nextInt();

        Division dobj = new Division();

        int iRet = dobj.Div(iNo, iNo2);

        System.out.print("Addition is "+iRet);
    }
}