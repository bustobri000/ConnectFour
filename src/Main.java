import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {

    public static JFrame Window;
    public static JPanel Panel;
    public static JButton Column0, Column1, Column2, Column3, Column4, Column5, Column6, Restart, ManualCheck;
    public static JLabel words;
    public static JLabel[][] space;
    public static boolean isRed = true;
    public static boolean isWon = false;
    public static boolean isFilled = false;
    public static boolean dummier = false;
    public static void main(String[] args) {

        Window = new JFrame("Connect 4");
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setSize(375, 600);

        Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBackground(Color.gray);

        space = new JLabel[7][6];

        Column0 = new JButton("1");
        Column0.setBounds( 5, 5, 50, 30);
        Column0.addActionListener(new Column0Listener());
        Column1 = new JButton("2");
        Column1.setBounds( 55, 5, 50, 30);
        Column1.addActionListener(new Column1Listener());
        Column2 = new JButton("3");
        Column2.setBounds( 105, 5, 50, 30);
        Column2.addActionListener(new Column2Listener());
        Column3 = new JButton("4");
        Column3.setBounds( 155, 5, 50, 30);
        Column3.addActionListener(new Column3Listener());
        Column4 = new JButton("5");
        Column4.setBounds( 205, 5, 50, 30);
        Column4.addActionListener(new Column4Listener());
        Column5 = new JButton("6");
        Column5.setBounds( 255, 5, 50, 30);
        Column5.addActionListener(new Column5Listener());
        Column6 = new JButton("7");
        Column6.setBounds( 305, 5, 50, 30);
        Column6.addActionListener(new Column6Listener());
        Restart = new JButton("Restart");
        Restart.setBounds(100, 375, 200, 50);
        Restart.addActionListener(new RestartListener());
        words = new JLabel("Line up 4 of the same color to win!");
        words.setBounds(100, 320, 200, 50);
        words.setForeground(Color.WHITE);

        for(int column = 0; column < 7; column++){
            for(int row = 0; row < 6; row++){
                space[column][row] = new JLabel(column + " " + row);
                space[column][row].setBounds((50*column+5), (50*row+55),30, 30);
                Panel.add(space[column][row]);

            }
        }

        Panel.add(words);
        Panel.add(Column0);
        Panel.add(Column1);
        Panel.add(Column2);
        Panel.add(Column3);
        Panel.add(Column4);
        Panel.add(Column5);
        Panel.add(Column6);
        Panel.add(Restart);

        Window.add(Panel);
        Window.setVisible(true);

        Game ticTacToe = new Game();
        ticTacToe.Play();
    }

    public static class Column0Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(isWon){words.setText("Please stop pressing the button."); dummier = true;}
            if(isFilled){return;}
            String dummy = "Red";
            if(isRed){GameBoard.PlaceOnBoard(Space.RED, 0);}
            if(!isRed){GameBoard.PlaceOnBoard(Space.YELLOW, 0);}
            GameBoard.Draw();
            isWon = Game.CheckForWin();
            if(isWon && !dummier){
                if(!isRed){dummy = "Yellow";}
                System.out.println("Player " + dummy + " has won!");
                words.setText("Player " + dummy + " has won!");
            }
            isRed = !isRed;
            if(isFilled){return;}
        }
    }
    public static class Column1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(isWon){words.setText("Please stop pressing the button."); dummier = true;}
            if(isFilled){return;}
            String dummy = "Red";
            if(isRed){GameBoard.PlaceOnBoard(Space.RED, 1);}
            if(!isRed){GameBoard.PlaceOnBoard(Space.YELLOW, 1);}
            GameBoard.Draw();
            isWon = Game.CheckForWin();
            if(isWon && !dummier){
                if(!isRed){dummy = "Yellow";}
                System.out.println("Player " + dummy + " has won!");
                words.setText("Player " + dummy + " has won!");
            }
            isRed = !isRed;
            if(isFilled){return;}
        }
    }
    public static class Column2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(isWon){words.setText("Please stop pressing the button."); dummier = true;}
            if(isFilled){return;}
            String dummy = "Red";
            if(isRed){GameBoard.PlaceOnBoard(Space.RED, 2);}
            if(!isRed){GameBoard.PlaceOnBoard(Space.YELLOW, 2);}
            GameBoard.Draw();
            isWon = Game.CheckForWin();
            if(isWon && !dummier){
                if(!isRed){dummy = "Yellow";}
                System.out.println("Player " + dummy + " has won!");
                words.setText("Player " + dummy + " has won!");
            }
            isRed = !isRed;
            if(isFilled){return;}
        }
    }
    public static class Column3Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(isWon){words.setText("Please stop pressing the button."); dummier = true;}
            if(isFilled){return;}
            String dummy = "Red";
            if(isRed){GameBoard.PlaceOnBoard(Space.RED, 3);}
            if(!isRed){GameBoard.PlaceOnBoard(Space.YELLOW, 3);}
            GameBoard.Draw();
            isWon = Game.CheckForWin();
            if(isWon && !dummier){
                if(!isRed){dummy = "Yellow";}
                System.out.println("Player " + dummy + " has won!");
                words.setText("Player " + dummy + " has won!");
            }
            isRed = !isRed;
            if(isFilled){return;}
        }
    }
    public static class Column4Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(isWon){words.setText("Please stop pressing the button."); dummier = true;}
            if(isFilled){return;}
            String dummy = "Red";
            if(isRed){GameBoard.PlaceOnBoard(Space.RED, 4);}
            if(!isRed){GameBoard.PlaceOnBoard(Space.YELLOW, 4);}
            GameBoard.Draw();
            isWon = Game.CheckForWin();
            if(isWon && !dummier){
                if(!isRed){dummy = "Yellow";}
                System.out.println("Player " + dummy + " has won!");
                words.setText("Player " + dummy + " has won!");
            }
            isRed = !isRed;
            if(isFilled){return;}
        }
    }
    public static class Column5Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(isWon){words.setText("Please stop pressing the button."); dummier = true;}
            if(isFilled){return;}
            String dummy = "Red";
            if(isRed){GameBoard.PlaceOnBoard(Space.RED, 5);}
            if(!isRed){GameBoard.PlaceOnBoard(Space.YELLOW, 5);}
            GameBoard.Draw();
            isWon = Game.CheckForWin();
            if(isWon && !dummier){
                if(!isRed){dummy = "Yellow";}
                System.out.println("Player " + dummy + " has won!");
                words.setText("Player " + dummy + " has won!");
            }
            isRed = !isRed;
            if(isFilled){return;}
        }
    }
    public static class Column6Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            if(isWon){words.setText("Please stop pressing the button."); dummier = true;}
            if(isFilled){return;}
            String dummy = "Red";
            if(isRed){GameBoard.PlaceOnBoard(Space.RED, 6);}
            if(!isRed){GameBoard.PlaceOnBoard(Space.YELLOW, 6);}
            GameBoard.Draw();
            isWon = Game.CheckForWin();
            if(isWon && !dummier){
                if(!isRed){dummy = "Yellow";}
                System.out.println("Player " + dummy + " has won!");
                words.setText("Player " + dummy + " has won!");
            }
            isRed = !isRed;
            if(isFilled){return;}
        }
    }

    public static class RestartListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            for(int column = 0; column < 7; column++){

                    for(int j = 0; j < 6; j++){
                        GameBoard.spaces[column][j] = Space.EMPTY;
                        GameBoard.spacesText[column][j] = (column + " " + j);
                        space[column][j].setText(column + " " + j);

                        Main.space[column][j].setForeground(Color.BLACK);
                    }

            }
            words.setText("Line up 4 of the same color to win!");
            dummier = false;
        }
    }
}

