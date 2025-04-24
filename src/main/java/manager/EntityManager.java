package manager;

import entity.base.Entity;
/**
 * EntityManager maneja todas las entidades del juego.
 * Permite agregarlas, eliminarlas o acceder por tipo.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona todas las entidades del juego.
 */
public class EntityManager {

    private List<Entity> entities;

    public EntityManager() {
        entities = new ArrayList<>();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public List<Entity> getEntities() {
        return entities;
    }
}

