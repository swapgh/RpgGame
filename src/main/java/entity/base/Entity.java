package entity.base;

import game.ui.GamePanel;

public abstract class Entity {
    public GamePanel gp;

    public Entity(GamePanel gp) {
        System.out.println("      └── Entity: Constructor");
        this.gp = gp;
    }

    public void handleInput(int key) {
    }
}
