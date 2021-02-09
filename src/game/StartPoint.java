package game;

import java.awt.*;

public class StartPoint extends GameTile {
    /**
     * Конструктор
     *
     * @param row
     * @param col
     * @param color
     */
    public StartPoint(int row, int col, Color color) {
        super(row, col, Color.yellow);
    }
    public void renderYellowTile(Graphics g) {
        int tileX = this.col = this.col * this.SIZE_OF_TILE;
        int tileY = this.row = this.row * this.SIZE_OF_TILE;

        g.fillRect(tileX,tileY,SIZE_OF_TILE,SIZE_OF_TILE);

    }
}

