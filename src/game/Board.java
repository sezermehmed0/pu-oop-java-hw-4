package game;

import javax.swing.*;
import java.awt.*;

public class Board  extends JFrame {

    /**
     * Constructor
     */
    public Board() {

        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Method for visualising the board
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                g.setColor(Color.pink);
                g.fillRect( row * 60 ,col*60+60,58,58 );
            }

         }
    }
}