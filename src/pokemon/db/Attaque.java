package pokemon.db;

import pokemon.model.Type;

public abstract class Attaque {
    private int pp;
    private String nom;
    private Type type;
    private int degat;

    public Attaque(int pp, String nom, Type type, int degat) {
        this.pp = pp;
        this.nom = nom;
        this.type = type;
        this.degat = degat;

    }

    public int utilisation(){
        if(pp >0) {
            pp--;
            return degat;
        }
        return 1;
    }

    public String getNom() {
        return nom;
    }

    public int getPp() {
        return pp;
    }
}
