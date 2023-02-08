public class Assignment24_1 {
    public static void main(String[] args) {
        System.out.println("Decimal\tHexa\tOcta");
        for (int i = 0; i < 127; i++)
        {
            System.out.printf("%d\t%x\t%c",i,i,i);
            System.out.println();
        }

    }
}
