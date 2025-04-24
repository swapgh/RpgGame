package game.core;

import entity.creatures.npc.Vendor;
import game.ui.GameFrame;
import game.ui.GamePanel;
import entity.player.Player;
import input.KeyInput;

public class Game implements Runnable {

    public Game() {
        System.out.println("  └── Game: Constructor");
        GamePanel panel = new GamePanel(); // instanciamos panel para usarlo
        Player player = new Player(panel);
        Vendor vendor = new Vendor(panel);



        GameFrame frame = new GameFrame(panel);
        frame.addKeyListener(new KeyInput(panel)); // controlar con teclado
        frame.setFocusable(true); // necesario para recibir input
        frame.requestFocusInWindow(); // asegurar foco             // creamos el jugador usando el panel
    }

    @Override
    public void run() {
        // lógica de juego si quieres después
    }
}
