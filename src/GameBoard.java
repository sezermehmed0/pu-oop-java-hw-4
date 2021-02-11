import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class which extends JFrame
 * @author Sezer Mehmed
 */
public class GameBoard extends JFrame {

    TileContainer tileContainer;
    JButton restartButton;

    /** Constructor
     *
     * @param tileContainer contains tile colors
     */
    public GameBoard(TileContainer tileContainer) {


        this.tileContainer = tileContainer;

        JPanel panel = new JPanel();
        restartButton = new JButton();
        restartButton.setText("Restart");
        restartButton.setSize(100, 50);
        restartButton.setLocation(100, 300);
       // restartButton.addActionListener(this);




        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    /**
     * paints board and tiles
     * @param g
     */
    public void paint(Graphics g) {

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                tileContainer.renderGameTile(g, row, col);
            }
        }

    }

   /* public void actionPerformed(ActionEvent e) {


        if (e.getSource() == restartButton) {
            if (e.getSource() == restartButton) {
                new TileFiller();
                this.repaint();
            }
        }

    */
}
