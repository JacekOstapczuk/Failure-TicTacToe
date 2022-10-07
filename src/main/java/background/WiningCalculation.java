package background;

import java.util.Map;

public class WiningCalculation {

    public void winingnSign (Map gameMap) {

        String space1;
        if (gameMap.containsKey(1)) {
            space1 = (String) gameMap.get(1);
        } else {
            space1 = "1";
        }

        String space2;
        if (gameMap.containsKey(2)) {
            space2 = (String) gameMap.get(2);
        } else {
            space2 = "2";
        }

        String space3;
        if (gameMap.containsKey(3)) {
            space3 = (String) gameMap.get(3);
        } else {
            space3 = "3";
        }

        String space4;
        if (gameMap.containsKey(4)) {
            space4 = (String) gameMap.get(4);
        } else {
            space4 = "4";
        }

        String space5;
        if (gameMap.containsKey(5)) {
            space5 = (String) gameMap.get(5);
        } else {
            space5 = "5";
        }

        String space6;
        if (gameMap.containsKey(6)) {
            space6 = (String) gameMap.get(6);
        } else {
            space6 = "6";
        }

        String space7;
        if (gameMap.containsKey(7)) {
            space7 = (String) gameMap.get(7);
        } else {
            space7 = "7";
        }

        String space8;
        if (gameMap.containsKey(8)) {
            space8 = (String) gameMap.get(8);
        } else {
            space8 = "8";
        }

        String space9;
        if (gameMap.containsKey(9)) {
            space9 = (String) gameMap.get(9);
        } else {
            space9 = "9";
        }


        if (space9.equals("X") && space8.equals("X")  && space7.equals("X") )  {
            System.out.println("X win!!!");
        }

        if (space6.equals("X") && space5.equals("X")  && space4.equals("X") )  {
            System.out.println("X win!!!");
        }
        if (space3.equals("X") && space2.equals("X")  && space1.equals("X") )  {
            System.out.println("X win!!!");
        }
        if (space9.equals("X") && space6.equals("X")  && space3.equals("X") )  {
            System.out.println("X win!!!");
        }
        if (space8.equals("X") && space5.equals("X")  && space2.equals("X") )  {
            System.out.println("X win!!!");
        }
        if (space7.equals("X") && space4.equals("X")  && space1.equals("X") )  {
            System.out.println("X win!!!");
        }
        if (space9.equals("X") && space5.equals("X")  && space1.equals("X") )  {
            System.out.println("X win!!!");
        }
        if (space7.equals("X") && space5.equals("X")  && space1.equals("X") )  {
            System.out.println("X win!!!");
        }




        if (space9.equals("O") && space8.equals("O")  && space7.equals("O") )  {
            System.out.println("O win!!!");
        }

        if (space6.equals("O") && space5.equals("O")  && space4.equals("O") )  {
            System.out.println("O win!!!");
        }
        if (space3.equals("O") && space2.equals("O")  && space1.equals("O") )  {
            System.out.println("O win!!!");
        }
        if (space9.equals("O") && space6.equals("O")  && space3.equals("O") )  {
            System.out.println("O win!!!");
        }
        if (space8.equals("O") && space5.equals("O")  && space2.equals("O") )  {
            System.out.println("O win!!!");
        }
        if (space7.equals("O") && space4.equals("O")  && space1.equals("O") )  {
            System.out.println("O win!!!");
        }
        if (space9.equals("O") && space5.equals("O")  && space1.equals("O") )  {
            System.out.println("O win!!!");
        }
        if (space7.equals("O") && space5.equals("O")  && space1.equals("O") )  {
            System.out.println("O win!!!");
        }

    }
}