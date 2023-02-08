import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Div {

    Scanner sobj = new Scanner(System.in);

    public void Division(int iNo) {

        for (int i = iNo; i > 0; i--) {
            System.out.println(i);
        }
    }
}

class Assignment1_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sobj.nextInt();

        Div dobj = new Div();
        dobj.Division(iNo);
    }
}