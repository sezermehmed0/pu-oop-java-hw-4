import java.awt.*;

public class TileContainer {

    private Tile[][] tileCollection;

    public TileContainer(Tile[][] tileCollection) {
        this.tileCollection = tileCollection;
    }

    public void renderGameTile(Graphics g, int row, int col) {

        tileCollection[row][col].render(g);
    }

}