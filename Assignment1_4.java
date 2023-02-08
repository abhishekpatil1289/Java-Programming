import java.util.Scanner;

/**
 * Assignment1_4
 */

class Divisible {
    Scanner sobj = new Scanner(System.in);

    public boolean Div()
    {
        System.out.println("Enter the number");
        int iNo = sobj.nextInt();

        boolean flag = false;
        if (iNo % 5 == 0) 
        {
            return true;
        }
        return flag;
    }
}

public class Assignment1_4 {
    public static void main(String[] args) {
        Divisible dobj = new Divisible();

        boolean bRet = dobj.Div();
        if (bRet == true)
        {
            System.out.println("Its Divisibleee");    
        }
        else
        {
            System.out.println("Not Divisible");
        }
    }
}