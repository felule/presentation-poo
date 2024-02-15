package pokemon.model;

import pokemon.db.Attaque;
import pokemon.db.Charge;
import pokemon.db.Eclaire;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Pokemon {
    private String nom;
    private String crie;
    private Type type;
    private int pointDeVie;
    private int vitesse;
    protected List<Attaque> attaques;
    private  List<Class<? extends Attaque>> glossaireAttaque;

    protected Pokemon (){};



    protected Pokemon (String nom, String crie, Type type, int pointDeVie, int vitesse, List<Class<? extends Attaque>> glossaireAttaque){
        this.nom = nom;
        this.crie = crie;
        this.type = type;
        this.pointDeVie = pointDeVie;
        this.vitesse = vitesse;
        this.glossaireAttaque = glossaireAttaque;
        this.attaques = new ArrayList<>();
    };

    public String getNom() {
        return nom;
    }

    public String getCrie() {
        return crie;
    }

    public Type getType() {
        return type;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public boolean isKO(){
        return pointDeVie <= 0;
    }

    public String menuAttaque(){
        String menu = "--------------------------\n";
        menu = menu.concat("Attaque 1 nom : " + this.attaques.get(0).getNom() + ", PP :" + this.attaques.get(0).getPp() + "\n");
        menu = menu.concat("Attaque 2 nom : " + this.attaques.get(1).getNom() + ", PP :" + this.attaques.get(1).getPp() + "\n");
        return menu;
    }

    public String attaque(int action, Pokemon cible){
        Attaque attaque = attaques.get(action-1);
        cible.encaisse(attaque.utilisation(), this.type);
        return attaque.getNom();

    }

    public void encaisse(int degat, Type type){
        this.pointDeVie -= degat;
    }

    protected void learnAttaque(Class<? extends Attaque> attaque) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.attaques.add(this.glossaireAttaque.get(this.glossaireAttaque.indexOf(attaque)).getDeclaredConstructor().newInstance());
    }
}
