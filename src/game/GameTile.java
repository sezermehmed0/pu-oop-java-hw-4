package game;

import java.awt.*;

public abstract class GameTile {
    protected int row;
    protected int col;
    protected Color color;
    public static final int SIZE_OF_TILE = 60;

    /**
     * Конструктор
     */
    public GameTile(int row, int col, Color color) {

              this.row = row;
              this.col = col;
              this.color = color;
    }

}

