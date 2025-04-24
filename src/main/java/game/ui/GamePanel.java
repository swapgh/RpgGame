package game.ui;

import entity.creatures.npc.Vendor;
import entity.player.Player;
import enums.GameState;
import manager.EntityManager;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
private final EntityManager entityManager = new EntityManager();
public GameState currentState = GameState.GAMEPLAY;

private Player player;
private Vendor vendor;

public GamePanel() {
    System.out.println("    └── GamePanel: Constructor");
    this.setBackground(Color.GREEN); // color por defecto
}

public void setPlayer(Player player) {
    this.player = player;
    entityManager.addEntity(player);
}

public void setVendor(Vendor vendor) {
    this.vendor = vendor;
    entityManager.addEntity(vendor);
}

public Player getPlayer() {
    return player;
}

public Vendor getVendor() {
    return vendor;
}

public GameState getCurrentState() {
    return currentState;
}

public void setCurrentState(GameState state) {
    this.currentState = state;

    switch (state) {
        case GAMEPLAY -> setBackground(Color.GREEN);
        case SHOP -> setBackground(Color.YELLOW);
        case BATTLE -> setBackground(Color.RED);
    }

    repaint(); // importante para actualizar el color
}

public EntityManager getEntityManager() {
    return entityManager;
}
}
