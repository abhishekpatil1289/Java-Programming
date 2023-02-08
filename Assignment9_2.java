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
    int Dollar = 70;
    System.out.println(iNo *  Dollar);

  }
}

public class Assignment9_2 {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number");
    int iNo = sobj.nextInt();

    pattern pobj = new pattern(iNo);

    pobj.patternx();
    
  }
}
