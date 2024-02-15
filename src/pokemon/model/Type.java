package pokemon.model;

public enum Type {
    FEU("FEU"),
    ELECTRIC("ELECTRIC"),
    GLACE("GLACE"),
    EAU("EAU"),
    PLANTE("PLANTE"),
    NORMAL("NORMAL");

    public final String type;

    Type(String type) {
        this.type = type;
    }
}