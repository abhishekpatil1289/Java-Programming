import java.util.Scanner;

class PatternPrint
{
    int Row = 0, Col = 0;
    PatternPrint(int a,int b)
    {
        Row = a;
        Col = b;
    }
    void PrintP()
    {
        char ch = 'A';
        for (int i = 0; i < Row; i++)
        {
            for (int j = 0; j < Col; j++)
            {
                System.out.print(ch+"\t");
            }    
            System.out.println();
            ch ++;
        }
    }
}

class Assignment36_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the row");
        int Row = sobj.nextInt();

        System.out.println("Enter the Col");
        int Col = sobj.nextInt();

        PatternPrint Pobj = new PatternPrint(Row,Col);

        Pobj.PrintP();

    }
}
