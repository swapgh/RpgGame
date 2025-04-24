package entity.creatures.npc;

import entity.base.Entity;
import game.ui.GamePanel;

public class Npc extends Entity {
    public Npc(GamePanel gp) {
        super(gp);
        System.out.println("        └── NPC: Constructor");
        speak();
    }

    public void speak() {
        System.out.println("        └── NPC dice: ¡Hola, soy un NPC!");
    }
}

