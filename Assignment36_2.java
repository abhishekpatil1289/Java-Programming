import java.util.Scanner;

class PatternPrint 
{
    void PatternX(int Row, int Col) 
    {
        char ch = 'A';
        char chSmall = 'a';
        for (int i = 1; i <= Row; i++)
        {
            for (int j = 1; j <= Col; j++)
            {
                if (i%2!=0)
                {
                    System.out.print(ch+"\t");
                }
                else
                {
                    System.out.print(chSmall+"\t");
                }
                ch++;
                chSmall++;
            }
            ch = 'A';
            chSmall = 'a';
            System.out.println();
        }
    }
}

class Assignment36_2 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int Row = sobj.nextInt();

        System.out.println("Enter the number of Column");
        int Col = sobj.nextInt();

        PatternPrint pobj = new PatternPrint();
        pobj.PatternX(Row, Col);
    }

}