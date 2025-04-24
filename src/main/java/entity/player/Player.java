package entity.player;

import entity.base.Entity;
import game.ui.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Player es el personaje controlado por el jugador.
 * Puede moverse y responder a inputs dependiendo del estado del juego.
 */
public class Player extends Entity {

    private int x, y;
    public Player(GamePanel gp) {
        super(gp);
        System.out.println("        └── Player: Constructor");

    }
    // Metodo para mover al player
    public void move(String direction) {
        System.out.println("          → Player se mueve: " + direction);
        switch (direction) {
            case "UP":
                setY(getY() - 5); // Mover hacia arriba
                break;
            case "DOWN":
                setY(getY() + 5); // Mover hacia abajo
                break;
            case "LEFT":
                setX(getX() - 5); // Mover hacia la izquierda
                break;
            case "RIGHT":
                setX(getX() + 5); // Mover hacia la derecha
                break;
        }
    }
    @Override
    public void handleInput(int keyCode) {
        if (keyCode == KeyEvent.VK_W) {
            System.out.println("Player se mueve arriba");
            move("UP"); // Movimiento hacia arriba
        }
        if (keyCode == KeyEvent.VK_S) {
            System.out.println("Player se mueve abajo");
            move("DOWN"); // Movimiento hacia abajo
        }
        if (keyCode == KeyEvent.VK_A) {
            System.out.println("Player se mueve a la izquierda");
            move("LEFT"); // Movimiento hacia la izquierda
        }
        if (keyCode == KeyEvent.VK_D) {
            System.out.println("Player se mueve a la derecha");
            move("RIGHT"); // Movimiento hacia la derecha
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);  // Color del jugador
        g.fillRect(getX(), getY(), 50, 50); // Dibujar un cuadrado
    }

}

