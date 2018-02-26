package Chess;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        PlayingPiece peshka =  new PlayingPiece(1,1);
        Scanner input = new Scanner(System.in);
        System.out.println(peshka.getX() + " " + peshka.getY());
        while (true){
            peshka.move(input.nextInt(), input.nextInt());
            System.out.println(peshka.getX() + " " + peshka.getY());
        }

    }
}
