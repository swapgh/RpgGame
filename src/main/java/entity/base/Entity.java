package entity.base;
import game.ui.GamePanel;
import javax.swing.JPanel;
import java.awt.Graphics;
public abstract  class Entity {
    protected GamePanel gp;
    protected int x, y;

    public Entity(GamePanel gp) {
        this.gp = gp;
        this.x = 100;  // posición inicial en X
        this.y = 100;  // posición inicial en Y
    }

    public abstract void handleInput(int keyCode);
    public abstract void paintComponent(Graphics g); // Metodo para dibujar la entidad

    // Métodos getter y setter para la posición de la entidad
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

