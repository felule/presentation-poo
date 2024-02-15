package heritage.model;

public class FilsA extends Pere {
    private String nom;

    public FilsA(String nom) {
        this.nom = nom;
    }

    @Override
    public String paroleDeFils() {
        return "Je suis " + this.nom + "\n"
                + "Voici ce que dit mon " + super.getParent() + " :\n" + this.explication();
    }

}
