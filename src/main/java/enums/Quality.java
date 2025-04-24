package enums;

public enum Quality {
    GREY_POOR(1),
    WHITE_COMMON(2),
    GREEN_UNCOMMON(3),
    BLUE_RARE(4),
    PURPLE_EPIC(5),
    ORANGE_LEGENDARY(6),
    RED_ARTIFACT(7);
    private final int ID;

    Quality(int ID){
        this.ID=ID;
    }
}
