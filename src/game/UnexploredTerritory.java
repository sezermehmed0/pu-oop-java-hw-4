package game;

import java.awt.*;

public class UnexploredTerritory extends GameTile {
    /**
     * Конструктор
     *
     * @param row
     * @param col
     * @param color
     */
    public UnexploredTerritory(int row, int col, Color color) {
        super(row, col, Color.pink);
    }
    public void renderPinkTile(Graphics g) {
        int tileX = this.col = this.col * this.SIZE_OF_TILE;
        int tileY = this.row = this.row * this.SIZE_OF_TILE;

        g.fillRect(tileX,tileY,SIZE_OF_TILE,SIZE_OF_TILE);

    }
}

