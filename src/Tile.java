import java.awt.*;

public class Tile {

    protected int row;
    protected int col;
    protected Color color;


    public Tile(int row, int col, Color color){
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public void setColor(Color newColor) {
        this.color = newColor;
    }

    public Color getColor(){
        return color;
    }

    public void render(Graphics g){
        g.setColor(this.color);
        g.fillRect(row * 60,col * 60 + 60,58,58);

    }
}