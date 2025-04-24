package enums;

public enum ItemType {
    CONSUMABLE(0),
    CONTAINER(1),
    WEAPON(2),
    GEM(3),
    ARMOR(4),
    REAGENT(5),
    PROJECTILE(6),
    TRADE_GOODS(7),
    GENERIC(8),
    RECIPE(9),
    MONEY(10),
    QUIVER(11),
    QUEST(12),
    KEY(13),
    PERMANENT(14),
    MISCELLANEOUS(15),
    GLYPH(16);
    private final int ID;

    ItemType(int ID) {
        this.ID = ID;
    }
}
