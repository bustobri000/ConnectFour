import java.awt.*;
import java.util.Scanner;

public class Game {
    private static GameBoard gameBoard;
    public Player player1;
    public Player player2;
    private final boolean isComplete = false;

    public Game(){
        gameBoard = new GameBoard();
        player1 = new Player(Space.RED, 1);
        player2 = new Player(Space.YELLOW, 2);
    }

    public void Play() {
        //Clean this up so that it handles repetition and ends the game when its over.

        Scanner myScan = new Scanner(System.in);
        GameBoard.Draw();

        while(true) {
            /*System.out.println("Player 1:  Enter a Column number.");
            int columnToPlace = myScan.nextInt();

            GameBoard.PlaceOnBoard(player1.getPiece(), columnToPlace);
            boolean ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 1 Wins");
                GameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                GameBoard.Draw();
                return;
            }
            GameBoard.Draw();

            System.out.println("Player 2:  Enter a Column number.");
            columnToPlace = myScan.nextInt();
            if (columnToPlace > 6) {
                columnToPlace = 6;
                System.out.println("Column out of range; set to closest point.");
            }
            if (columnToPlace < 0) {
                columnToPlace = 0;
                System.out.println("Column out of range; set to closest point.");
            }
            GameBoard.PlaceOnBoard(player2.getPiece(), columnToPlace);
            ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 2 Wins");
                GameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                GameBoard.Draw();
                return;
            }
            GameBoard.Draw();*/
            String command = myScan.next();

            if(command.equals("fillAll")){
                for (int i = 0; i < 7; i++) {
                    for(int j = 0; j < 6; j++){
                        GameBoard.spaces[i][j] = Space.DUMMY;
                        GameBoard.spacesText[i][j] = " D ";
                        Main.space[i][j].setText(" D ");
                        Main.space[i][j].setForeground(Color.WHITE);
                        }
                }
            }

        }

    }

    public static boolean CheckForWin() {
        //Implement this method.
        //horz
        for (int column = 0; column < 4; column++){
            for(int row = 0; row < 6; row++){
                if((GameBoard.spaces[column][row] == GameBoard.spaces[column+1][row]) && (GameBoard.spaces[column+2][row] == GameBoard.spaces[column+3][row]) && ((GameBoard.spaces[column][row]) == GameBoard.spaces[column+3][row]) && !GameBoard.spaces[column][row].equals(Space.EMPTY)){
                    return true;
                }
            }
        }

        //vert
        for (int column = 0; column < 7; column++){
            for(int row = 0; row < 3; row++){
                if(((GameBoard.spaces[column][row] == GameBoard.spaces[column][row+1])) && (GameBoard.spaces[column][row+2] == GameBoard.spaces[column][row+3]) && ((GameBoard.spaces[column][row]) == GameBoard.spaces[column][row+3]) && !GameBoard.spaces[column][row].equals(Space.EMPTY)){
                    return true;
                }
            }
        }
        //diag bl > tr
        for (int column = 0; column < 4; column++){
            for(int row = 5; row > 3; row--){
                if(((GameBoard.spaces[column][row] == GameBoard.spaces[column+1][row-1])) && (GameBoard.spaces[column+2][row-2] == GameBoard.spaces[column+3][row-3]) && ((GameBoard.spaces[column][row]) == GameBoard.spaces[column+3][row-3]) && !GameBoard.spaces[column][row].equals(Space.EMPTY)){
                    return true;
                }
            }
        }

        // diag tl > br
        for (int column = 0; column < 4; column++){
            for(int row = 0; row < 3; row++){
                if(((GameBoard.spaces[column][row] == GameBoard.spaces[column+1][row+1])) && (GameBoard.spaces[column+2][row+2] == GameBoard.spaces[column+3][row+3]) && ((GameBoard.spaces[column][row]) == GameBoard.spaces[column+3][row+3]) && !GameBoard.spaces[column][row].equals(Space.EMPTY)){
                    return true;
                }
            }
        }


return false;
    }

    private boolean IsFilled() {
        for (int i = 0; i < 7; i++) {
            for(int j = 0; j < 6; j++)
            if (GameBoard.spaces[i][j] == Space.EMPTY){
                Main.isFilled = false;
                return false;
            }
        }
        Main.isFilled = true;
        return true;
    }
}
