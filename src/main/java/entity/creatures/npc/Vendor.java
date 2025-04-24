package entity.creatures.npc;
import entity.base.Entity;
import game.ui.GamePanel;
import java.awt.event.KeyEvent;

public class Vendor extends Entity {
    public Vendor(GamePanel gp) {
        super(gp);
        System.out.println("        └── Vendor: Constructor");
    }

    public void openShop() {
        System.out.println("          → Vendor abre la tienda 🛒");
    }
    @Override
    public void handleInput(int keyCode) {
        if (keyCode == KeyEvent.VK_W) {
            System.out.println("Vendor sube en la lista de ítems");
        }
    }
}

