import java.util.Scanner;

class PatternPrint
{
    int ch = 1;
    void PrintP(int Row,int Col)
    {
        for (int i = 1; i <= Row; i++)
        {
            for (int j = 0; j < Col; j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }    
            System.out.println();
        }
    }
}

class Assignment36_5 {
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
