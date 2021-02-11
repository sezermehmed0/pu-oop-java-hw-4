import java.awt.*;
import java.util.Random;

public class TileFiller {
    int firstRandNumber;
    int secondRandNumber;
    public static final int TILE_COUNT = 8 ;
    Tile[][] tileCollection = new Tile[8][8];

    public Tile[][] fillTile() {

        unexploredTerritory();
        GpsCoordinate();
        impassableTerritory();

        return tileCollection;
    }

    /**
     * Method, for placement of pink tiles on the board
     */
    public void unexploredTerritory() {
        for (int row = 0; row < TILE_COUNT; row++) {
            for (int col = 0; col < TILE_COUNT; col++) {
                tileCollection[row][col] = new Tile(row, col, Color.pink);
            }
        }
    }


    /**
     * Method,for placement of green tiles on the board
     */
    public void GpsCoordinate() {


        for (int i = 0; i < TILE_COUNT; i++) {
            firstRandNumber = randomNumberGenerator();
            secondRandNumber = randomNumberGenerator();

            if (tileCollection[firstRandNumber][secondRandNumber].getColor() == Color.pink) {
                tileCollection[firstRandNumber][secondRandNumber].setColor(Color.GREEN);
            } else {
                i--;
            }
        }
    }

    /**
     * Method, for placement of blue tiles on the board
     */
    public void impassableTerritory() {
        int row, col;

        for (int i = 0; i < 5; i++) {
            row = randomNumberGenerator();
            col = randomNumberGenerator();

            if (tileCollection[row][col].getColor() == Color.pink) {
                tileCollection[row][col].setColor(Color.BLUE);
            } else {
                i--;
            }
        }
    }

    /**
     * Method,for generating random numbers.
     * @return
     */
    private int randomNumberGenerator() {
        Random rand = new Random();
        return rand.nextInt(8);
    }
}
