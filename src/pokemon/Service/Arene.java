package pokemon.Service;

import pokemon.model.Pokemon;

import java.util.Scanner;

public class Arene {
    public Arene() {
    }

    public static Pokemon duel(Pokemon pokemonA, Pokemon pokemonB){
        while(!isWinner(pokemonA, pokemonB)){
            if(pokemonA.getVitesse() > pokemonB.getVitesse()){
                tour(pokemonA, pokemonB);
                if(isWinner(pokemonA, pokemonB))
                    break;
                tour(pokemonB, pokemonA);
            } else {
                tour(pokemonB, pokemonA);
                if(isWinner(pokemonA, pokemonB))
                    break;
                tour(pokemonA, pokemonB);
            }
            System.out.println("\n----------------------Nouveau tour--------------------\n");
        }
        return pokemonA.isKO() ? pokemonB : pokemonA;
    }

    private static boolean isWinner(Pokemon pokemonA, Pokemon pokemonB) {
        return pokemonA.isKO() || pokemonB.isKO();
    }

    private static int lireAction(Pokemon pokemon){

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while( i < 1 || i > 4){
            System.out.println("Quelle Attaque faite vous ? " + pokemon.menuAttaque());
            i = sc.nextInt();
        }
        return i;
    }

    private static void tour(Pokemon acteur, Pokemon cible) {
        System.out.println(acteur.getNom() + " " + acteur.getCrie());
        int action = lireAction(acteur);
        System.out.println(acteur.attaque(action, cible) + "!");
        System.out.println("c'est tres efficase");
        System.out.println("point de vie restant : " + cible.getPointDeVie() + "\n");
    }

}
