package enums;

public enum EquipType {
    NON_EQUIPABLE(0),
    HEAD(1),
    NECK(2),
    SHOULDER(3),
    SHIRT(4),
    CHEST(5),
    WAIST(6),
    LEGS(7),
    FEET(8),
    WRISTS(9),
    HANDS(10),
    FINGER(11),
    TRINKET(12),
    ONE_HAND(13),
    SHIELD(14), /*(class = armor, not weapon even if in weapon slot)*/
    RANGED(15),/*(Bows) (see also Ranged right = 26)*/
    BACK(16),
    TWO_HAND(17),
    BAG(18),
    TABARD(19),
    ROBE(20), /*(see also Chest = 5)*/
    MAIN_HAND(21),
    OFF_HAND(22), /*weapons (see also One-Hand = 13)*/
    HELD_IN_OFF_HAND(23), /*(tome, cane, flowers, torches, orbs etc... See also Off-Hand = 22) (class = armor, not weapon even if in weapon slot)*/
    AMMO(24),
    THROWN(25),
    RANGED_RIGHT(26), /*(Wands, Guns) (see also Ranged = 15)*/
    QUIVER(27),
    RELIC(28); /*(class = armor, not weapon even if in weapon slot)*/
    private final int ID;
    EquipType(int ID){
        this.ID=ID;
    }
}
