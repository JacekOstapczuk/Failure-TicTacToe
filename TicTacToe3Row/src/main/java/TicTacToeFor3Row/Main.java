
package TicTacToeFor3Row;

import java.util.Scanner;

public class Main {

        public static void main (String[] args) {

            ActualGame actualGame = new ActualGame();
            System.out.println("jeśli chcesz zagrać w grę jednoosobową wciśnij  1  \njeśli chcesz zagrać w grę jednoosobową wciśnij  2 ");
            int choice = getInt();

            if (choice == 1) {
                actualGame.manage1Players();
            } else if (choice == 2) {
                actualGame.manage2Players();
            } else {
                System.out.println("Dokonano błednego wyboru");
            }
        }


    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}

