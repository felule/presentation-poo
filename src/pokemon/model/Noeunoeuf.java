package pokemon.model;

import pokemon.db.Charge;
import pokemon.db.Eclaire;
import pokemon.db.FouetLiane;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Noeunoeuf extends Pokemon{
    public Noeunoeuf(String nom) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        super(nom, "noeunoeuf", Type.PLANTE, 25, 5, List.of(Charge.class, FouetLiane.class));
        learnAttaque(Charge.class);
        learnAttaque(FouetLiane.class);
    }
}
