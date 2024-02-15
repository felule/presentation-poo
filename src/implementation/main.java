package implementation;

import implementation.model.*;

import java.util.List;

public class main {
    public static void main(String[] args){
        Chat chat = new Chat();
        VerreDeTerre verreDeTerre = new VerreDeTerre();
        Humain humain = new Humain();

        List<Communique> groupe = List.of(chat, verreDeTerre, humain);
        for(Communique indivu : groupe){
            indivu.moyenDeCommunication();
        }

        chat.nombreDeVertebre();
        humain.nombreDeVertebre();
    }
}
