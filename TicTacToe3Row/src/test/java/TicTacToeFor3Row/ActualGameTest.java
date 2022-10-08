package TicTacToeFor3Row;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActualGameTest {


    @Test
    public void OWiningInLine() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        String expected = gameEndingByWiningException.anoucment;
        //When
       try {
           testedGame.actualGame(1, "O");
           testedGame.actualGame(2, "O");
           testedGame.actualGame(3, "O");
       } catch (BadNumberException e ) {
           result = "this shouldn't happen";
       } catch (GameEndingByWiningException e) {
           result = e.anoucment;
       }
        //Then
        Assertions.assertEquals (  expected, result);
    }

    @Test
    public void OWiningInColumn() {
        //Given

        //When

        //Then
    }

    @Test
    public void OWiningInSlant() {
        //Given

        //When

        //Then
    }

    @Test
    public void XWiningInLine() {
        //Given

        //When

        //Then
    }

    @Test
    public void XWiningInColumn() {
        //Given

        //When

        //Then
    }

    @Test
    public void XWiningInSlant() {
        //Given

        //When

        //Then
    }

    @Test
    public void Draw() {
        //Given

        //When

        //Then
    }

    @Test
    public void BadMove() {
        //Given

        //When

        //Then
    }



}
