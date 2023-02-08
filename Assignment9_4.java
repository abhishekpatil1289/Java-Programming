import java.util.*;


class pattern
{
  int iNo =0;
  public pattern(int No)
  {
    iNo = No;
  };
  public void patternx()
  {
    int iMult = 1;
    for (int i = 1; i <= iNo; i=i+2)
    {
      if (i % 2 !=0)
      {
        iMult = iMult * i;
      }
    }
    System.out.println(iMult);
  }
}

public class Assignment9_4 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();

    pattern pobj = new pattern(iNo);

    pobj.patternx();
    
  }
}
