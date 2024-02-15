package implementation.model;

public class Chat implements Communique, Vertebre {
    @Override
    public void moyenDeCommunication() {
        System.out.println("miaul");
    }

    @Override
    public void nombreDeVertebre() {
        System.out.println("43");
    }
}
