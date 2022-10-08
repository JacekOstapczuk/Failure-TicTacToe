/*
package TicTacToeFor3RowSimplified;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class ActualGame {

    Map<Integer, String> gameMap = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActualGame that = (ActualGame) o;

        return Objects.equals(gameMap, that.gameMap);
    }

    @Override
    public int hashCode() {
        return gameMap != null ? gameMap.hashCode() : 0;
    }

    Players players = new Players();
    GameRun gameRun = new GameRun();
    Visual visual = new Visual();

    WiningCalculation winingCalculation = new WiningCalculation();



    public void actualGame() {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                players.announcementForPlayerX();
                int givenNumber = getInt();
                try {
                    gameMap = gameRun.numberGettingAndVerification(gameMap, givenNumber, "X");

                } catch (BadNumberException e) {
                    i--;
                }
               visual.draw(gameMap);
                winingCalculation.winingnSign(gameMap);
            } else {
                players.announcementForPlayerO();
                int givenNumber = getInt();
                try {
                    gameMap = gameRun.numberGettingAndVerification(gameMap, givenNumber,"O");
                } catch (BadNumberException e) {
                i--;
                }
               visual.draw(gameMap);
                winingCalculation.winingnSign(gameMap);
            }
        if (i==8) {
            System.out.println("Gra zakończyła się remisem");
        }
        }
        }


    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}



 */