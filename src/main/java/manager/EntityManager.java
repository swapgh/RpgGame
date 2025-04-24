package manager;

import entity.base.Entity;

import java.util.ArrayList;
import java.util.List;

public class EntityManager {
    private final List<Entity> entities = new ArrayList<>();

    public void addEntity(Entity e) {
        entities.add(e);
    }

    public void removeEntity(Entity e) {
        entities.remove(e);
    }

    public List<Entity> getAll() {
        return entities;
    }

    public <T extends Entity> List<T> getEntitiesOfType(Class<T> type) {
        List<T> result = new ArrayList<>();
        for (Entity e : entities) {
            if (type.isInstance(e)) {
                result.add(type.cast(e));
            }
        }
        return result;
    }
}

