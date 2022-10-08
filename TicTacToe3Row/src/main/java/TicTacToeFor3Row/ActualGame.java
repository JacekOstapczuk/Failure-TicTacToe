
package TicTacToeFor3Row;

import java.util.*;

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
    Random randomGenerator = new Random();
    WiningCalculation winingCalculation = new WiningCalculation();

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }


    public void manage1Players() {
        String witchXOSign = "";


        for (int i = 0; i < 9; i++) {
            int givenNumber;
            if (i % 2 == 0) {
                players.announcementForPlayerX();
                witchXOSign = players.signForPlayerX();
                 givenNumber = getInt();
            } else {
                witchXOSign = players.signForPlayerO();
                givenNumber = randomGenerator.nextInt(10);;
            }


            try {
                actualGame(givenNumber, witchXOSign);
            } catch (BadNumberException e ) {
                i--;
            } catch (GameEndingByWiningException e) {
                System.out.println(e.anoucment + witchXOSign);
                break;
            }
        }
    }




    public void manage2Players() {
        String witchXOSign = "";

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                players.announcementForPlayerX();
                witchXOSign = players.signForPlayerX();
            } else {
                players.announcementForPlayerO();
                witchXOSign = players.signForPlayerO();
            }
            int givenNumber = getInt();

            try {
                actualGame(givenNumber, witchXOSign);
            } catch (BadNumberException e ) {
                i--;
            } catch (GameEndingByWiningException e) {
                System.out.println(e.anoucment + witchXOSign);
                break;
            }
        }
    }


    public Map<Integer,String > actualGame  (int givenNumber, String witchXOSign)throws  BadNumberException, GameEndingByWiningException {

        try {
            gameMap = gameRun.numberGettingAndVerification(gameMap, givenNumber, witchXOSign);
        } catch (BadNumberException e ){
                throw new BadNumberException();
            }

        visual.draw(gameMap);
        try {
            winingCalculation.winingnSign(gameMap);
        } catch (GameEndingByWiningException e) {
            throw new GameEndingByWiningException();
        } return  gameMap;
    }

}




