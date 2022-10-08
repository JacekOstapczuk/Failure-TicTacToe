

package TicTacToeFor3Row;

import java.util.Map;
import java.util.Scanner;

public class GameRun {

    public Map<Integer,String > numberGettingAndVerification(Map<Integer, String> gameMap, Integer givenNumber, String witchXOSign)
            throws BadNumberException {

        if (givenNumber < 1 || givenNumber > 9) {
            System.out.println("podano niewłaściwą liczbe, należy podać liczbę pomiędzy 1-9 ");
            throw new BadNumberException();
        }
        if (gameMap.containsKey(givenNumber)) {
            System.out.println("podano użytą już liczbe, proszę podać liczbę oznaczającą wolne pole");
            throw new BadNumberException();
        }

        gameMap.put(givenNumber, witchXOSign);
        return gameMap;
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}


