import java.util.*;

import javax.swing.text.html.FormView;

class pattern
{
  int iNo =0;
  public pattern(int No)
  {
    iNo = No;
  };

  public void patternx()
  {
    for(int i = 1; i <= iNo*2; i++)
    {
      if (i > iNo) {
        System.out.print("* \t");
      }
      else
      {
        System.out.print("# \t");
      }
    }
  }
}

public class Assignment9_1 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();

    pattern pobj = new pattern(iNo);

    pobj.patternx();
    
  }
}
