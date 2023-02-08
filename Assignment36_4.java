import java.util.Scanner;

class PatternPrint
{
    void PrintP(int Row,int Col)
    {
        for (int i = Row; i >= 1; i--)
        {
            for (int j = 0; j < Col; j++)
            {
                System.out.print(i+"\t");
            }    
            System.out.println();
        }
    }
}

class Assignment36_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the row");
        int Row = sobj.nextInt();

        System.out.println("Enter the Col");
        int Col = sobj.nextInt();

        PatternPrint Pobj = new PatternPrint();

        Pobj.PrintP(Row,Col); 
    }
}
