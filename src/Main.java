public class Main {

    public static void main(String[] args) {
        TileFiller fill = new TileFiller();
        TileContainer tileContainer = new TileContainer(fill.fillTile());
        GameBoard gameBoard = new GameBoard(tileContainer);

    }
}