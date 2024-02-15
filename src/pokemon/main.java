package pokemon;

import pokemon.Service.Arene;
import pokemon.model.Noeunoeuf;
import pokemon.model.Pikachu;
import pokemon.model.Pokemon;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Pikachu pikachu = new Pikachu("leFionJaune");
        Noeunoeuf noeunoeuf = new Noeunoeuf("Feloche");
        Pokemon vainqueur = Arene.duel(pikachu, noeunoeuf);
        System.out.println("Bravo victoire à : " + vainqueur.getNom() + " - " + vainqueur.getClass().toString() + "\n");
        System.out.println(vainqueur.getCrie());
    }
}
