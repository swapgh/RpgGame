package game.core;

import entity.creatures.npc.Vendor;
import game.ui.GameFrame;
import game.ui.GamePanel;
import entity.player.Player;
import input.KeyInput;

public class Game implements Runnable {

    public Game() {
        System.out.println("  └── Game: Constructor");

        // Creamos el GamePanel
        GamePanel panel = new GamePanel();

        // Creamos las entidades
        Player player = new Player(panel);
        Vendor vendor = new Vendor(panel);

        // Añadir las entidades al EntityManager del GamePanel
        panel.getEntityManager().addEntity(player);
        panel.getEntityManager().addEntity(vendor);

        // Crear el frame
        GameFrame frame = new GameFrame(panel);
        frame.addKeyListener(new KeyInput(panel)); // Controlar con teclado
        frame.setFocusable(true); // Necesario para recibir input
        frame.requestFocusInWindow(); // Aseguramos que el frame tenga el foco
    }

    @Override
    public void run() {
        // lógica de juego si quieres después
    }
}
