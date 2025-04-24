package entity.player;

import entity.base.Entity;
import game.ui.GamePanel;

import java.awt.event.KeyEvent;

public class Player extends Entity {

    public Player(GamePanel gp) {
        super(gp);
        System.out.println("        └── Player: Constructor");
//        gp.color();
    }
    public void move(String direction) {
        System.out.println("          → Player se mueve: " + direction);
    }
    @Override
    public void handleInput(int keyCode) {
        if (keyCode == KeyEvent.VK_W) {
            System.out.println("Player se mueve arriba");
        }
    }

    public void handleBattleInput(int keyCode) {
        if (keyCode == KeyEvent.VK_W) {
            System.out.println("Player selecciona ataque");
        }
    }
}

