import java.util.*;

class mult
{
    int iSize = 0;
    mult(int iNo)
    {
        iSize = iNo;
    }

    public int AssignmentMult()
    {
        int iMult = 1;

        for (int i = 1; i <= (iSize/2); i++) 
        {
            if (iSize % i == 0) 
            {
                iMult = iMult * i;
            }
        }
        return iMult;
    }
}

public class Assignment4_1 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo = sobj.nextInt();

        mult m = new mult(iNo);
        int iRet = m.AssignmentMult();
        System.out.println("Multiplication of Factors is "+iRet);
    }
}
