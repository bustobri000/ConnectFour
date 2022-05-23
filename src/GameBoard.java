import javax.swing.*;
import java.awt.*;


public class GameBoard {

    public static JFrame Window;
    public static JPanel Panel;
    public static JButton Column0, Column1, Column2, Column3, Column4, Column5, Column6;

    static Space[][] spaces;
    static String[][] spacesText;



    public GameBoard(){

        spaces = new Space[7][6];
        spacesText = new String[7][6];

        for(int column = 0; column < 7; column++){
            for(int row = 0; row < 6; row++){
            spaces[column][row] = Space.EMPTY;
            spacesText[column][row] = column + "," + row;
            }
        }

    }

    public static void PlaceOnBoard(Space pieceToPlace, int columnToPlace){

        int rowToPlace;


        if(pieceToPlace == Space.EMPTY) {
            int row;
            for (row = 5; row > 0; row--){
                spacesText[columnToPlace][row] = columnToPlace + " " + row;
            Main.space[columnToPlace][row].setText(columnToPlace + " " + row);
            Main.space[columnToPlace][row].setForeground(Color.BLACK);
            return;}
        }

        if (spaces[columnToPlace][5] == Space.EMPTY) {
            rowToPlace = 5;

        } else if (spaces[columnToPlace][4] == Space.EMPTY){
            rowToPlace = 4;

        } else if (spaces[columnToPlace][3] == Space.EMPTY) {
            rowToPlace = 3;

        } else if (spaces[columnToPlace][2] == Space.EMPTY) {
            rowToPlace = 2;

        } else if (spaces[columnToPlace][1] == Space.EMPTY) {
            rowToPlace = 1;

        } else if (spaces[columnToPlace][0] == Space.EMPTY){
            rowToPlace = 0;

        } else {

            System.out.println("Error! Catastrophic Failure!");
            rowToPlace = 0;

        }

            if(pieceToPlace == Space.RED){
                spacesText[columnToPlace][rowToPlace] = " R ";

                Main.space[columnToPlace][rowToPlace].setText(" R ");
                Main.space[columnToPlace][rowToPlace].setForeground(Color.RED);
            }
            else if (pieceToPlace == Space.YELLOW){
                spacesText[columnToPlace][rowToPlace] = " Y ";

                Main.space[columnToPlace][rowToPlace].setText(" Y ");
                Main.space[columnToPlace][rowToPlace].setForeground(Color.YELLOW);
            }
        spaces[columnToPlace][rowToPlace] = pieceToPlace;

    }

    public static void Draw(){
        for(int row = 0; row < 6; row++) {
            System.out.println(" " + spacesText[0][row] + " | " + spacesText[1][row] + " | " + spacesText[2][row] + " | " + spacesText[3][row] + " | " + spacesText[4][row] + " | " + spacesText[5][row] + " | " + spacesText[6][row]);

        }
    }// Love


}


