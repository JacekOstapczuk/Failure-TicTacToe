
package TicTacToeFor3Row;

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

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public void managePlayers() {
        String  witchXOSign ="";

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                players.announcementForPlayerX();
                witchXOSign = players.signForPlayerX();
            } else {
                players.announcementForPlayerO();
                 witchXOSign = players.signForPlayerO();
            }
                int givenNumber = getInt();
                actualGame(givenNumber, witchXOSign);
            }
            }




    public void actualGame(int givenNumber, String witchXOSign) {

        try {
            gameMap = gameRun.numberGettingAndVerification(gameMap, givenNumber, witchXOSign);

        } catch (BadNumberException e) {
        //    i--;
        }
        visual.draw(gameMap);
        try {
            winingCalculation.winingnSign(gameMap);
        } catch (GameEndingByWiningException e) {
            System.out.println(e + witchXOSign);
        }
    }

}




