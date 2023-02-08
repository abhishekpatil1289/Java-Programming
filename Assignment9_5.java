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
    int iEven = 1;
    int iMult = 1;
    for (int i = 1; i <= iNo; i++)
    {
      if (i % 2 !=0)
      {
        iMult = iMult * i;
      }
      else
      {
        iEven = iEven * i;
      }
    }
    System.out.println(iEven-iMult+"\t\t"+iEven+""+"  "+iMult);
  }
}

public class Assignment9_5
{
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();

    pattern pobj = new pattern(iNo);

    pobj.patternx();
    
  }
}
