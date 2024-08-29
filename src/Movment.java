import javax.swing.*;
import java.awt.*;

public class Movment extends JPanel {

    private static final int SIZE = 4;
    private static int[][] gameBoard = new int[SIZE][SIZE];
    private static final int TILE_SIZE = 100;
    private static final int GAP = 10;

    public Movment(){

        initializeGameBoard();
        setPreferredSize(new Dimension());

    }

    private void initializeGameBoard(){

    }

}
