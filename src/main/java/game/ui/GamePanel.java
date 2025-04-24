package game.ui;
import java.util.List;
import java.util.ArrayList;
import entity.base.Entity;
import manager.EntityManager;
import javax.swing.*;
import java.awt.*;
/**
 * GamePanel es el panel principal donde se dibuja el juego.
 * Gestiona entidades, el estado actual y cambia el fondo según la pantalla.
 */
public class GamePanel extends JPanel {
    public EntityManager entityManager;
    private List<Entity> entities;  // Lista de entidades


public GamePanel() {
    System.out.println("    └── GamePanel: Constructor");
    this.entityManager = new EntityManager();
    color();
    this.setFocusable(true); // Asegúrate de que el panel sea enfocable
    this.requestFocusInWindow(); // Asegúrate de que el panel tenga el foco
//    this.entities = new ArrayList<>();
}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar cada entidad en la lista
        for (Entity entity : entityManager.getEntities()) {
            entity.paintComponent(g);  // Llamar al metodo de cada entidad para que se dibuje
        }
    }

    public void addEntity(Entity entity) {
        entities.add(entity);  // Agregar entidades al panel
    }

    public void color() {
        this.setBackground(Color.GREEN);  // Cambiar color de fondo del panel
    }

    public List<Entity> getEntities() {
        return entities;
    }
    public EntityManager getEntityManager() {
        return entityManager;
    }
}