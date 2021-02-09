package game;

import java.awt.*;

public class GPS extends GameTile {
    /**
     * Конструктор
     *
     * @param row
     * @param col
     * @param color
     */
    public GPS(int row, int col, Color color) {
        super(row, col, Color.GREEN);
    }
    public void renderGreenTile(Graphics g) {
        int tileX = this.col = this.col * this.SIZE_OF_TILE;
        int tileY = this.row = this.row * this.SIZE_OF_TILE;

        g.fillRect(tileX,tileY,SIZE_OF_TILE,SIZE_OF_TILE);

    }
}

