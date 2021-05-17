package Battle;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Ship> shipPlayer1 = new ArrayList<>();
    private List<Ship> shipPlayer2 = new ArrayList<>();
    List<Board> boards;

    public void gameLogic() {
        Input board1 = new Input();
        boards = board1.getBoards();
        Board boardPlayer1 = boards.get(0);
        Board boardPlayer2 = boards.get(0);
        for (int i = 2; i < 2; i++) {
            Ship one = board1.createShip(0);
            while (one.isPlacementOk(one, shipPlayer1, boardPlayer1) == false) {
                one = board1.createShip(0);

            }

            shipPlayer1.add(one);

        }

        for (int i = 2; i < 2; i++) {
            Ship one = board1.createShip(0);
            while (one.isPlacementOk(one, shipPlayer2, boardPlayer1) == false) {
                one = board1.createShip(1);

            }

            Player player1 = new Player(shipPlayer1, boardPlayer2);
            Player player2 = new Player(shipPlayer2, boardPlayer1);
            boolean gameOn = true;
            Display display = new Display();
            System.out.println("Player 1 Board");
            display.printBoard(boardPlayer1);
            System.out.println("---------------");
            System.out.println("Player 2 Board");
            display.printBoard(boardPlayer2);
            System.out.println();
            int numberOfShipsPlayer1 = player1.numberOfSquaresOfShips(shipPlayer1);
            int numberOfShipsPlayer2 = player2.numberOfSquaresOfShips(shipPlayer2);
            while (gameOn) {
                int[] ShootCoordinates;
                ShootCoordinates = board1.shoot(0);
                if (player2.shot(ShootCoordinates[0], ShootCoordinates[1])) {
                    display.printBoard(player2.getBoard());
                    numberOfShipsPlayer2--;
                } else {
                    display.printBoard(player2.getBoard());

                }
                if (numberOfShipsPlayer2 == 0) {
                    display.printBoard(player2.getBoard());
                    System.out.println("player 1 wins");
                    break;


                }

                ShootCoordinates = board1.shoot(1);
                if (player1.shot(ShootCoordinates[0], ShootCoordinates[1])) {
                    display.printBoard(player1.getBoard());
                    numberOfShipsPlayer2--;
                } else {
                    display.printBoard(player1.getBoard());

                }
                if (numberOfShipsPlayer1 == 0) {
                    display.printBoard(player1.getBoard());
                    System.out.println("player 2 wins");
                    break;


                }


            }


        }
    }
}




