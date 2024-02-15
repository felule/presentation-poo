package pokemon.model;

import pokemon.db.Attaque;
import pokemon.db.Charge;
import pokemon.db.Eclaire;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Pikachu extends Pokemon {


    public Pikachu(String nom) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        super(nom, "pika pika", Type.ELECTRIC, 20, 10, List.of(Charge.class, Eclaire.class));
        learnAttaque(Charge.class);
        learnAttaque(Eclaire.class);
    }


}
