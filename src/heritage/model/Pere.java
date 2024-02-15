package heritage.model;

public abstract class Pere {
    public static String but = "Heritage";
    private final String parent = "pere";
    protected String perimetre = "enfant";

    public String getParent() {
        return parent;
    }

    public Pere() {
    }

    public abstract String paroleDeFils();

    protected String explication(){
        return "Ceci est une explication de " + but + "\n"
                + "Je suis le " + this.parent + "\n"
                + "Seul mes " + this.perimetre + " peuvent me lire";
    }

}
